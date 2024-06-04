let person = {
    
    firstName: "John",
    lastName: "Doe",
    age: 30,
    hobbies: ["reading", "traveling", "swimming"],
    
    // Method to get the full name
    getFullName: function() {
        return this.firstName + " " + this.lastName;
    },
    
    // Method to add a new hobby
    addHobby: function(hobby) {
        this.hobbies.push(hobby);
        return hobby
    },
    
    // Method to get all hobbies
    getHobbies: function() {
        return this.hobbies.join(", ");
    }
};


console.log("First name: ", person.firstName); 
console.log("Last name: ", person.lastName);
console.log("Full name: ", person.getFullName());
console.log("Adding hobby listening", person.addHobby("listening"));
console.log("Get all hobbies", person.getHobbies());
