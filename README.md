# 🎴 Hunter x Hunter — Java OOP Project

> **Final Project — Object-Oriented Programming | UNIFEI**
> A Java simulation of the *Hunter x Hunter* universe, modelling characters, abilities, locations, and story events through OOP concepts.

---

## 📖 About

This project recreates key arcs of the **Hunter x Hunter** manga/anime as an interactive console narrative built entirely in **Java 17**. The program walks the user through iconic story moments — from the Hunter Exam to the Yorknew City arc — while demonstrating core OOP principles such as inheritance, encapsulation, polymorphism, design patterns (Singleton, Factory), and enumerations.

---

## 🗂️ Project Structure

```
hunter-x-hunter/
├── pom.xml
└── src/
    ├── main/
    │   └── java/br/edu/unifei/hunterproject/
    │       ├── Main.java                  # Entry point & story narrative
    │       ├── LivingBeing/               # Base class for all living entities
    │       ├── Hunters/                   # Hunter, Human, President, Zodiacs, Training…
    │       ├── ChimeraAnts/               # Chimera Ant hierarchy (Queen, Factory, Enum)
    │       ├── nen/                       # Nen system (Ten, Ren, Gyo, Hatsu, Abilities…)
    │       ├── groups/                    # HunterAssociation, PhantomTroupe, Exam, Mission…
    │       ├── Terrain/                   # World locations (City, Region, Continent, HuntingSite…)
    │       ├── animals/                   # Animal taxonomy (Mammal, Reptile, Bird, Amphibious)
    │       └── plants/                    # Plant entities (Tree…)
    └── test/
        └── java/                          # Unit tests
```

---

## ✨ Features

| Domain | Classes / Concepts |
|---|---|
| **Characters** | `Human`, `Hunter`, `President`, `VicePresident`, `Zodiacs`, `CommonWorker` |
| **Nen System** | `Nen`, `Ten`, `Ren`, `Gyo`, `Hatsu`, `En`, `Ko`, `In`, `Restu` + `NenUserTypeEnum` |
| **Groups** | `HunterAssociation` *(Singleton)*, `PhantomTroupe` *(Singleton)*, `Exam`, `Mission`, `Event` |
| **Chimera Ants** | `Queen`, `ChimeraAnt`, `ChimeraAntFactory`, `AntsHierarchyEnum` |
| **World** | `Continent`, `Region`, `City`, `HuntingSite`, `DangerZone`, `GeographicalFeature` |
| **Animals & Plants** | `Mamal`, `Reptile`, `Bird`, `Amphibious`, `Tree` |
| **Training** | `Training` *(abstract)*, `PhysicalTraining`, `NenTraining` |

---

## 📚 Story Arcs Covered

1. **Hunter Exam Arc** — Pre-exam, Milsy Wetlands, Trick Tower, Zevil Island, Final Battles
2. **Zoldyck Family Arc** — Rescuing Killua from Mountain Kokuroo
3. **Heavens Arena Arc** — Nen awakening, Gyo, Hatsu types, fight with Hisoka
4. **Yorknew City Arc** — Phantom Troupe, Kurapika's Chain Jail, auction heist

---

## 🛠️ Technologies

| Tool | Version |
|---|---|
| Java | 17 |
| Maven | 3.x |
| JUnit | (via Maven test scope) |

---

## 🚀 How to Run

### Prerequisites
- Java 17+ installed
- Maven 3.x installed

### Build & Run

```bash
# Clone the repository
git clone <repo-url>
cd hunter-x-hunter

# Compile with Maven
mvn compile

# Run the main class
mvn exec:java -Dexec.mainClass="br.edu.unifei.hunterproject.Main"
```

Or directly with Java after compiling:

```bash
mvn package
java -cp target/hunter-x-hunter-1.0-SNAPSHOT.jar br.edu.unifei.hunterproject.Main
```

### Run Tests

```bash
mvn test
```

---

## 🎓 OOP Concepts Applied

- **Inheritance** — `LivingBeing → Human → Hunter`, `Training → PhysicalTraining / NenTraining`
- **Encapsulation** — Private fields with getters/setters across all entities
- **Polymorphism** — `Occupation` interface implemented by `Hunter`, `CommonWorker`, `President`, etc.
- **Singleton Pattern** — `HunterAssociation`, `PhantomTroupe`, `President`, `VicePresident`
- **Factory Pattern** — `ChimeraAntFactory`
- **Enumerations** — `NenUserTypeEnum`, `AntsHierarchyEnum`, `TerrainTypeEnum`, `DangerEnum`, `cityEnum`
- **Abstract Classes** — `Training`, `Nen`, `LivingBeing`

---

## 👤 Author

Developed by a Year-3 student at **UNIFEI (Universidade Federal de Itajubá)** as a Final Project for the Object-Oriented Programming course.

---

## 📄 License

This project is for **academic purposes only**. Hunter x Hunter is a trademark of Yoshihiro Togashi / Shueisha.
