function palindrome(input) {
  let biggest = "";
  let current = "";
  let alt = "";
  for(let i = 0; i < input.length; i++) {
    current += input.charAt(i);
    let reverse = ""
    for(let j = current.length - 1; j >= 0; j--){
      reverse += current.charAt(j);
      //console.log(reverse)
    }
    if(current == reverse) {
      //console.log(current);
      if(biggest.length < current.length) {
        biggest = current;
      }
    } else {
      // current = "";
    }
  }
  return biggest;
}

function biggestPalindrome(input) {
  let top = ""
  for(let i = 0; i < input.length; i++) {
    for(let j = i+1; j <= input.length; j++) {
      let teststring = input.substring(i,j);
      console.log(teststring)
      //console.log(palindrome(teststring));
      if(palindrome(teststring) == teststring) {
        console.log(palindrome(teststring));
        if(teststring.length > top.length) {
          top = teststring;
        }
      }
    }
  }
  return top;
}

console.log(palindrome("racecar"))
console.log(biggestPalindrome("cheese"))
console.log(biggestPalindrome("apple"))