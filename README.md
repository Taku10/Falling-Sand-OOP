Object-Oriented Falling Sand

A Java-based falling sand simulation demonstrating object-oriented principles, GUI rendering, and simple particle physics.

Table of Contents

Features

Requirements

Installation & Running

Project Structure

Extending the Simulation

Contributing

License

Contact

Features

Multiple Particle Types: Sand, water, and customizable particles with unique behaviors.

Object-Oriented Design: Separation of concerns via Particle, Grid, and Simulation classes.

Real-Time Simulation: Adjustable frame rate for smooth updates.

Interactive GUI: Draw particles on the canvas with mouse; switch types with keyboard shortcuts.

Extensibility: Easily add new particle behaviors by subclassing the base Particle class.

Requirements

Java JDK 8 or higher

(Optional) IDE such as IntelliJ IDEA, Eclipse, or NetBeans

Installation & Running

Clone the repository

git clone git@github.com:Taku10/Falling-Sand-OOP.git
cd Falling-Sand-OOP/ObjectOrientedFallingSand

Compile source files

javac -d bin src/*.java

Launch the simulation

java -cp bin Main

Click or drag on the window to spawn particles.

Use keys (e.g., S for sand, W for water) to change particle type.

Press C to clear the grid.

Project Structure

ObjectOrientedFallingSand/
├── src/                   # Java source code
│   ├── Main.java          # Entry point and GUI setup
│   ├── simulation/        # Simulation engine
│   │   ├── Simulation.java
│   │   └── Grid.java
│   └── particles/         # Particle definitions
│       ├── Particle.java  # Base class
│       ├── Sand.java      # Sand behavior
│       ├── Water.java     # Water behavior
│       └── ...            # Other particle types
├── bin/                   # Compiled classes (generated)
└── README.md              # Project documentation

Main.java: Initializes the window, handles input, starts the simulation loop.

Grid.java: Manages a 2D array of Particle instances and updates them.

Particle.java: Defines common properties and abstract update() method.

Sand.java, Water.java: Implement specific movement rules and rendering.

Extending the Simulation

Create a new particle:

Add MyParticle.java in particles/.

Extend Particle and implement update().

Enable spawning:

Update ParticleFactory or input handler in Main.java.

Assign a keyboard key to your new particle type.

Contributing

Fork the repo

Create a branch: git checkout -b feature/YourFeature

Commit changes: `git commit -m "Add MyParticle"

Push: git push origin feature/YourFeature

Open a Pull Request

Please follow existing code style and include Javadoc comments for public methods.

License

Released under the MIT License. See LICENSE for details.

Contact

For issues or suggestions, open an issue on GitHub or contact:

Takunda Madziwa✉️ tvmadziwa5@gmail.com
