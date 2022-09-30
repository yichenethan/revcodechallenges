function reversal(array) {
  let newArray = []
  for (let i = array.length - 1; i >= 0 ; i--) {
    newArray.push(array[i]);
  }
  return newArray;
}

console.log(reversal([1,2,3]));
