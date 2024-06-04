function addMatrices(matrix1, matrix2) {
    let result = [];

    // Check if matrices have the same dimensions
    if (matrix1.length !== matrix2.length || matrix1[0].length !== matrix2[0].length) {
        throw new Error("Matrices must have the same dimensions");
    }

    for (let i = 0; i < matrix1.length; i++) {
        result[i] = [];
        for (let j = 0; j < matrix1[i].length; j++) {
            result[i][j] = matrix1[i][j] + matrix2[i][j];
        }
    }

    return result;
}


let matrix1 = [
    [1, 2, 3],
    [4, 5, 6],
    [7, 8, 9]
];

let matrix2 = [
    [9, 8, 7],
    [6, 5, 4],
    [3, 2, 1]
];


let sumMatrix = addMatrices(matrix1, matrix2);

console.log("Matrix 1:");
console.log(matrix1);
console.log("Matrix 2:");
console.log(matrix2);
console.log("Sum of Matrix 1 and Matrix 2:");
console.log(sumMatrix);
