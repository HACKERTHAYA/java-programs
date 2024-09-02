// Wait for the DOM to fully load
document.addEventListener('DOMContentLoaded', function() {
    // Get the button element by its ID
    const button = document.getElementById('myButton');

    // Define the function to be executed when the button is clicked
    function showAlert() {
        alert('Hello, you clicked the button!');
    }

    // Attach the click event listener to the button
    button.addEventListener('click', showAlert);
});
