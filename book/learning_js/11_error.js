const email = "jane@doe.com"
function validateEmail(email) {
    return email.match(/@/) ?
        email : new Error(`invalid email: ${email}`)
}


// instanceof 로 error 객체인지 확인... 귀찮다!
const validatedEmail = validateEmail(email)

if (validatedEmail instanceof Error) {
    console.error(`Error: ${validatedEmail.message}`)
} else {
    console.log(`Valid email: ${validatedEmail}`)
}

const email2 = null // ..... 이런.......

// try, catch 로 확인, 요게 좀 더 일반적인 방법.
try {
    const validatedEmail = validateEmail(email2)

    if (validatedEmail instanceof Error) {
        console.error(`Error: ${validatedEmail.message}`)
    } else {
        console.log(`Valid email: ${validatedEmail}`)
    }
} catch(err) {
    console.error(`Error: ${err.message}`)
}

function billPay(amount, payee, account) {
    if (amount > account.balance)
        throw new Error("insuffficient funds")
    account.transfer(payee, amount)
}