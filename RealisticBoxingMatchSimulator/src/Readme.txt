Fighter Competition Simulation
This Java program simulates a two-player fighter competition, where two fighters engage in rounds of combat until one emerges as the winner. The fighters are represented as objects of the Fighter class, and the competition itself is controlled by the Competition class. The simulation involves attacks, dodges, and health tracking, making it a simplified representation of a combat scenario.

Contents
Introduction
Components
Main Class
Fighter Class
Competition Class
How It Works
Fighter Initialization
Competition Initialization
Deciding the First Attacker
Running the Competition
Determining the Winner
Usage
Conclusion
Introduction

This simulation program demonstrates the interaction between two fighters in a combat scenario. Each fighter has attributes like damage, health, weight, and dodge ability. The Competition class orchestrates the simulation by determining the order of attacks, resolving hit and dodge events, and declaring the winner.

Components
Main Class
The Main class serves as the entry point for the program. It initializes two fighter objects (f1 and f2) and a competition object (competition) with specific attributes. It then triggers the competition simulation by deciding the first attacker and running the rounds of combat.

Fighter Class
The Fighter class defines the attributes and behavior of each fighter. The class includes the following components:

name: The name of the fighter.
damage: The amount of damage the fighter inflicts on an opponent with each hit.
health: The health points of the fighter, representing their ability to sustain damage.
weight: The weight of the fighter, influencing their eligibility for the competition.
dodge: The dodge ability of the fighter, determining the likelihood of evading an opponent's attack.
The hit method calculates the result of an attack and updates the opponent's health accordingly. The isDodge method generates a random number to determine if the fighter successfully dodges an incoming attack.

Competition Class
The Competition class controls the flow of the competition and manages the interactions between the fighters. The class includes the following components:

f1 and f2: Instances of the Fighter class representing the two fighters participating in the competition.
minWeight and maxWeight: Weight restrictions that fighters must meet to be eligible for the competition.
The class includes methods to:

decideFirstAttacker: Randomly determine which fighter attacks first.
run: Simulate rounds of combat until one fighter's health drops to zero or below.
isCheck: Check whether both fighters meet the weight requirements for the competition.
isWin: Determine the winner based on the health points of the fighters.

How It Works
Fighter Initialization
In the Main class, two fighters (f1 and f2) are created with specific attributes, such as name, damage, health, weight, and dodge.

Competition Initialization
A Competition object is initialized with the two fighters (f1 and f2) and weight restrictions (minWeight and maxWeight).

Deciding the First Attacker
The decideFirstAttacker method in the Competition class randomly determines which fighter attacks first. This decision is made with a 50% chance for each fighter.

Running the Competition
The run method in the Competition class simulates rounds of combat between the fighters. Attacks and dodges are resolved in alternating order until one fighter's health becomes zero or negative.

Determining the Winner
The isWin method in the Competition class determines the winner based on the health points of the fighters. The fighter with health points equal to or below zero is declared the loser, and the other fighter is declared the winner.

Usage
Compile and run the Main class to start the simulation.
Observe the simulation output, which includes information about attacks, dodges, and the winner.

Conclusion
This fighter competition simulation offers a simplified representation of combat interactions between two fighters. It showcases the implementation of classes, methods, attributes, and randomization in Java. This simulation can be extended and modified to include additional features, complexities, and strategies, making it a foundation for more advanced combat simulations or games.