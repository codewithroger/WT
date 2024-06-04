
function divide(a, b) {
    if (b === 0) {
      throw new Error("Division by zero is not allowed.");
    }
    return a / b;
}
  
  
try {
    let result1 = divide(10, 2);
    console.log(`Result: ${result1}`);
  
    let result2 = divide(10, 0);
    console.log(`Result: ${result2}`); 
} 
catch (error) {
    console.error(`Error: ${error.message}`); 
} 
finally {
    console.log("Execution completed."); 
}
  