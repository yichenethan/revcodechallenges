function leftShift(inputArray) {
  let newArray = [];
  for (let i = 1; i < inputArray.length; i++) {
    newArray.push(inputArray[i]);
    console.log(inputArray[i]);
  }
  newArray.push(inputArray[0]);

  return newArray;
}
let testArray = [0,1,2,3];
console.log(leftShift(testArray))