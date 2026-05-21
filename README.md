# Blackjack Java Terminal Card Game

A terminal-based Java card game developed using object-oriented programming, procedural programming, lists, and standard programming patterns.

This project was developed as an earlier version of my card game work before extending the concept into a JavaFX/MVC graphical application.

## Overview

This project is a terminal-based card game where a dealer manages a main deck, a secondary deck, and a group of players.

The purpose of this project was to implement the core game logic through Java classes, object relationships, menu-driven input, player turns, card dealing, attacking, health tracking, and game-ending conditions.

The game focuses on applying object-oriented programming principles by separating responsibilities across dealer, player, deck, and card-related classes.

## Gameplay Overview

The game is played through the terminal using menu-based interaction.

The dealer controls the game flow by choosing whether to show deck contents, view total player health, play a round, or end the game.

During each round, the dealer deals cards from the main deck and, on certain turns, from the secondary deck. Players can choose whether to store cards in their hand, discard cards, or play a card immediately.

Cards have health values, attack values, and weapon types. When a player attacks, the card’s attack value is applied as damage to the next player around the table.

The game continues until the dealer ends the game or the main deck no longer has enough cards to continue. The winner is the player with the highest total health remaining across the cards in their hand.

## Related Project

This terminal-based project was later extended into a JavaFX card game application.

The JavaFX version builds on the same core model logic and object relationships, but replaces terminal input/output with a graphical user interface, FXML views, controller classes, and MVC-style structure.

## How the Game Works

1. The game starts with a dealer, a main deck, a secondary deck, and a set of players.

2. The dealer can choose from a terminal menu to:
   - Show the contents of the main deck and secondary deck
   - Show the total health of all players
   - Play a round
   - End the game

3. When a round begins, the dealer deals a card from the main deck.

4. On specific turns, the dealer may also deal a card from the secondary deck.

5. If a secondary card is dealt, the current player can choose whether to place it into their hand or discard it.

6. If the player’s hand is full, the secondary card is automatically discarded.

7. The player can choose whether to place the main card into their hand or play it immediately.

8. If the player’s hand is full, the main card is automatically played.

9. If the player chooses not to play the main card immediately, they must select a card from their hand to play.

10. The played card attacks the next player around the table.

11. The defending player’s cards lose health based on the attacking card’s attack value.

12. Cards with the same weapon type as the attacking card receive double damage.

13. Cards with health reduced to zero or below are removed from the defending player’s hand.

14. The game continues until the dealer ends the game or the main deck no longer has enough cards to continue.

15. The winner is the player with the highest total remaining card health.

## Features

- Terminal-based menu system
- Dealer-controlled game flow
- Main deck and secondary deck management
- Player hand management
- Card health and attack system
- Weapon type damage logic
- Turn-based attacking system
- Automatic card discard when a hand is full
- Automatic card play when required
- Player health calculation
- Winner determination
- Object-oriented Java structure

## Game Rules

- Players attack the next player in the player list.
- If the current player is the last player, the attack wraps around to the first player.
- A secondary card is dealt every set number of turns based on the number of players.
- If a player’s hand is full, certain cards are automatically discarded or played.
- If two players finish with the same winning score, the earliest player in the player list wins.
- The game ends when the dealer ends the game or when the main deck cannot continue another round.

## Project Structure

```text
.
├── src/
│   ├── Card.java
│   ├── Deck.java
│   ├── Dealer.java
│   ├── Player.java
│   └── App.java
│
├── .gitignore
└── README.md
