/**
 * @param {number[]} nums
 * @param {Function} fn
 * @param {number} init
 * @return {number}
 */
var reduce = function(nums, fn, init) {
    if(nums.length ===0) return init;
    ans =init;
    for (const dat of nums) {
       ans = fn(ans, dat )
    }
    return ans;
    
};