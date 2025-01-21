What is the Java Streams API?
The Streams API, introduced in Java 8, provides a way to process collections (like Lists, Sets, and Maps) in a functional and declarative style, rather than using loops and if-else statements.

Key Features of Java Streams
Functional-style operations – Makes code shorter and easier to read.
Lazy Evaluation – Operations are only executed when needed.
Parallel Execution – Easily process data in parallel to improve performance.
Immutability – Original data remains unchanged.
Pipelining – Multiple operations can be chained together.

Stream Operations: Intermediate vs Terminal
Intermediate operations - transform the stream; they are lazy(executed when a terminal operation is called).
- filter()- keep only elements that match a condition
- map()- transform elements from one type to another 
- sorted()- sort elements 
- distinct() - Remove duplicates

Terminal Operations - End the stream and produce a result or side effect.
- collect() - Gather results into a collection 
- forEach() - Perform an action on each element 
- count() - count the number of elements 
- reduce() - combine elements into a single result

Parallel Streams (For Performance Optimization)
If you have a large dataset, you can process elements in parallel using:


List<String> names = List.of("Alice", "Bob", "Charlie");
names.parallelStream()
    .forEach(System.out::println);

When to use parallel streams?
- When processing large datasets.
- When the operations are CPU-intensive.
- When order of processing doesn't matter.
~ Avoid parallel streams if the operations involve I/O or updating shared variables.

Common Use Cases of Streams API
- Filtering and transforming data (e.g., extract emails from user objects)
- Aggregating data (e.g., finding max/min/average of numbers)
- Collecting results into lists, maps, or sets
- Chaining multiple operations for complex data processing
- Working with large collections efficiently

When to use loops instead?
- When performance and readability of simple operations are key.
- If operations require modifying elements (Streams don't allow direct modifications).

Common Mistakes to Avoid
- Forgetting terminal operations – Intermediate operations alone won’t trigger processing.
- Mixing parallel and sequential streams – Can lead to unexpected results.
- Using streams for trivial tasks – Sometimes, a simple loop is better.
- Modifying the original collection – Streams work best with immutable data.

Best Practices
Use method references (Class::method) when possible for cleaner code.
Chain operations logically to keep code readable.
Use collect(Collectors.toList()) instead of creating lists manually.
Use parallel streams only when processing large datasets.

Quick Summary
Streams allow for functional-style data processing.
Two types of operations: intermediate (e.g., filter, map) and terminal (e.g., collect, forEach).
Always call a terminal operation to execute a stream.
Use parallel streams wisely to improve performance.
Prefer streams over loops for cleaner, declarative code.

once a stream has been used you can't reuse it.