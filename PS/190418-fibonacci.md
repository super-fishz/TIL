코딜리티에 들어갔다가 fibonocci 문제를 최적화 하라길래...

```javascript

var yourself = {
    _cache: [0,1],
    fibonacci : function(n) {
        if (n === 0 || n === 1) {
            return this._cache[n];
        } else {
            return this.iter(n);
        }
    },
    iter : function(n) {
        if (typeof this._cache[n] != "undefined") {
            return this._cache[n];
        } else {
            this._cache[n] = this.iter(n-1) + this.iter(n-2)
            return this._cache[n];
        }
    }
};
```
