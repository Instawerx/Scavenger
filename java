document.addEventListener("DOMContentLoaded", function() {
    const coinsDisplay = document.getElementById("coins");
    let coins = 0;

    // Function to update coins display
    function updateCoinsDisplay() {
        coinsDisplay.textContent = coins;
    }

    // Function to handle buying clues
    function buyClue() {
        // Implement logic to deduct coins and provide clues
        coins -= 10; // Example deduction of 10 coins per clue
        updateCoinsDisplay();
        alert("Clue bought successfully!");
    }

    // Event listener for Buy Clue button
    const buyClueBtn = document.getElementById("buy-clue-btn");
    buyClueBtn.addEventListener("click", buyClue);

    // Initial coins display update
    updateCoinsDisplay();
});
