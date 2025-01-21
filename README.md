Some Fun Facts I learned today about lists and Array list
List is an interfance so you can't just initialise it by creating it's object, instead you use a class that implements the interface like ArrayList

Using ArrayList (Fully Mutable List)
Allows adding, removing, and modifying elements.
Proper way to initialize:

List<Employee> employees = new ArrayList<>();
employees.add(new Employee("Monaleo", 500000));
Best when you need flexibility to modify the list later.

Using List.of() (Immutable List)
Creates a fixed, read-only list (cannot add or remove elements).
Initialization example:

List<Employee> employees = List.of(
    new Employee("Monaleo", 500000),
    new Employee("Doe", 600000)
);
Suitable for fixed data that won't change.

Using Arrays.asList() (Fixed-Size Mutable List)
Allows modifying elements, but not adding/removing them.
Initialization example:

List<Employee> employees = Arrays.asList(
    new Employee("Monaleo", 500000),
    new Employee("Doe", 600000)
);
Useful when you know the exact number of elements and don't need to resize the list.

Combining List.of() with ArrayList for Flexibility
Allows initializing with values while keeping the ability to modify later.
Example:
List<Employee> employees = new ArrayList<>(List.of(
    new Employee("Monaleo", 500000),
    new Employee("Doe", 600000)
));
employees.add(new Employee("Jane", 700000));

Common Mistake:
List<Employee> employees = new List<Employee>(); is incorrect, because List is an interface and needs an implementing class like `Array
