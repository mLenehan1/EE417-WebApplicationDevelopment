# Databases

## Relational Databases

- Relational DBMS's organise data into tables, which can be linked by common
  info, to make data storage more efficient
- Analagous to traditional filing system
 - database - complete collection of info
 - tables - group of data items with common theme
 - records - individual data item
 - fields - separate piece of info describing the data item

## Tables

- Tables form the organising principle in a relational database
- Each table within a schema has a unique tale name

\begin{figure}[H]
\includegraphics{}
\centering
\caption{}
\label{}
\end{figure}

- Each horizontal row represents a single physical entity
- Each vertical column represents one item of data for each customer

## Tables - Columns

- Each column holds the same data type
- Example:
 - SURNAME column holds variable length column strings
 - ID column values are integers
- Each column has a column name, each column must have a different name in an
  individual tale
- Columns have a left-to-right order, defined on table creation
- Tables must have at least one column and in theory (ANSI/ISO) no maximum
- Practical implementations support 255+ columns minimum

## Tables - Row

- Rows (unlike columns) are not stored in any particular order
- No guarantee that rows will be listed in same order twice
- Is possible to add filter/sort data using SQL statements
- A table can have 0 rows (known as empty table)
- ANSI/ISO standard does not limit the max no. of rows
- Most DB implementations will all table to grow until exhausts available disk
  space on computer

## Primary Keys


