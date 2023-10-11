---

# Application - Horus

## Description

The task requires implementing and testing methods in the `Wall` class, focusing on `findBlockByColor`, `findBlocksByMaterial`, `count`, `getBlocks`, `getColor`, and `getMaterial`.

## Methods

### 1. `findBlockByColor(String color)`

The `findBlockByColor` method is responsible for returning an element of the specified color. It utilizes the `Optional<Block>` return type, ensuring that a missing element with the specified color is handled gracefully. The result is the first block with the specified color found in the list of blocks.

### 2. `findBlocksByMaterial(String material)`

This method returns a list of all elements made of a given material. It returns a list of `Block` objects with the specified material. The `Wall` class filters the blocks to retrieve the matching ones and returns them as a list.

### 3. `count()`

The `count` method calculates the total number of elements that make up the structure. In the context of the `Wall` class, it equals the number of blocks in the list. The result is an integer representing the count of blocks in the structure.

### 4. `getBlocks()`

The `getBlocks` method is a simple accessor method that returns the list of blocks contained within the `Wall` structure. It provides access to the entire list of blocks.

### 5. `getColor()`

The `getColor` method retrieves the color of the first block in the list of blocks. If the list is empty, it returns a default value of "No color." This method ensures that the color of the first block is accessible.

### 6. `getMaterial()`

The `getMaterial` method is similar to `getColor`, but it retrieves the material of the first block in the list. If the list is empty, it returns a default value of "Lack of material."

## Testing

The project includes a set of unit tests that validate the correctness of the implemented methods in the `Wall` class. These tests cover all aspects of the required functionality and are a critical part of the application.

## Contact

If you have any questions or feedback, feel free to contact us at [Kozlowski Kamil](mailto:kozlowski.kamil2k@gmail.com).
[Portfolio](https://kozlowskikamil.github.io/)