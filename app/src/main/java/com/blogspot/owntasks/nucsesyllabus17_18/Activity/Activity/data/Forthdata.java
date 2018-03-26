package com.blogspot.owntasks.nucsesyllabus17_18.Activity.Activity.data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Mahbub on 25-Mar-18.
 */

public class Forthdata {
    public static HashMap<String, List<String>> getDatafo() {
        HashMap<String, List<String>> expandableListDetail = new HashMap<String, List<String>>();

        List<String> Dbms = new ArrayList<String>();
        Dbms.add("Introduction: General overview and purpose of DBMS, advantages, applications, common features and overall structure of the database. Data modeling: Relational model: structure of relational model, key constraints, referential integrity constraints, general constraints, relational algebra – fundamental, additional and extended operations, aggregate functions, outer joins and database modification using RA. ER model: entity and relationship sets, constraints – key, mapping cardinality and participation constraints, strong and weak entity sets, E-R diagram, class hierarchies, aggregation, conceptual database design with the ER model, Relational database design: Features of good relational design, functional dependency theory - basic concept, uses, closure of a set of FDs, closure of attribute sets, canonical cover, atomic domains and first normal form.Database application development: Database Management Systems (DBMSs), SQL: data definition and data manipulation languages, integrity constraints, basic queries, nested and complex queries, modification of the database, Views: definition, update on views, cursors, Extending DBMS functionality: stored procedures, assertions and triggers, SQL");


        List<String> Mical = new ArrayList<String>();
        Mical.add("Introduction to Microprocessor: Evolution of Microprocessor, overview of microcomputer structure and operation, introduction to RISC and CISC processors. 8086 Microprocessor: Introduction to 8086 microprocessor, 8086 architecture, registers and other components of 8086 system, 8086 instruction sets, Addressing modes. 8086 system connections, timing and troubleshooting, 8086 interrupts and interrupt applications, Architecture of 8259A (priority interrupt controller), higher versions of 8086. Assembly Language Programming: Writing programs for use with an assembler, assembly language program development tools, implementing standard program structures in x86 (8086, i386 and Pentium) assembly language, testing and debugging an assembly language program, processing string, macros and procedures, assembler directives.");

        List<String> Daaa = new ArrayList<String>();
        Daaa.add("Techniques for analysis of algorithms; methods for the design of efficient algorithms; divide and conquer; merge sort; greedy method; dynamic programming; back tracking: graph coloring problem, n-queens problems and Hamiltonian cycle; branch and bound; basic search and traversal techniques; topological sorting; connected components; graph algorithms: shortest path and spanning tree; flow algorithms: The Ford-Fulkerson method, maximum bipartite matching; algebraic simplification and transformations; string matching problems: Naïve string matching algorithm, The Boyer-More algorithm and Knuth-Morris-Pratt algorithm; approximation algorithms; knapsack problem; matrix chain multiplication; lower bound theory, NP-hard and NP-complete problems");

        List<String> Dbmsl = new ArrayList<String>();
        Dbmsl.add("Objectives: Database labs are based on the theory course CSE 520213. One large or several small database applications will be developed in the lab. Student will be given the ER model or description of a real problem. Based on the description they will design the ER model or convert the ER model to relational model using the features of relational database design(such as functional dependency, normalization etc) and finalize the relational model. After finalizing the relational model, student will go for implementation. In the implementation phases they should design the sql statements, stored procedure, trigger, views etc. whatever is required to complete the implementation. In the implementation phase should also be the main concern about query optimization, transaction, recovery and backup. Any database such as Oracle/MySql/PostGressSQL can be used.");

        List<String> Micalb = new ArrayList<String>();
        Micalb.add("Computer Programming Techniques: flowchart, pseudocode and algorithm; structured programming language: data types, operators, expressions; control structures; functions and program structure: parameter passing conventions, scope rules and storage classes, recursion; header files; preprocessor; pointers and arrays; strings; multidimensional array; dynamic memory allocation; linked list: single linked list, double linked list, circular linked list; user defined data types: structures, unions, enumerations; bitwise operations; input and output: standard input and output, formatted input and output; error handling; file access; variable length argument list; command line parameters; error handling; graphics; linking; library functions");

        List<String> Daaal = new ArrayList<String>();
        Daaal.add("Laboratory classes are based on the course CSE 520217. Students will be given various algorithmic problems on different domains. By solving those problems students will gain knowledge on algorithmic techniques and their relative performances.");


        List<String> Numerical = new ArrayList<String>();
        Numerical.add("Solutions of equation in one variable: Bisection algorithm. Method of false position. Fixed point iteration, Newton-Raphson method, Error Analysis iteration for iterative method, Accelerating limit of convergence. Interpolation and polynomial approximation : Taylor polynomial, interpolation and Lagrange polynomial. Iterated Interpolation. Extrapolation. Differentiation and Integration : Numerical differentiation. Richardson’s extrapolation. Elements ofNumerical integration. Adaptive quadrature method, Romberg’s integration, Gaussian quadrature. Solutions of linear system, pivoting strategies, L U decomposition method.");


        //7
        expandableListDetail.put("Database Management System", Dbms);
        //2
        expandableListDetail.put("Microprocessor and Assembly Language",Mical);
        //4
        expandableListDetail.put("Design and Analysis of Algorithms", Daaa);
        //6
        expandableListDetail.put("Database Management System Lab", Dbmsl);
        //1
        expandableListDetail.put("Microprocessor and Assembly Language Lab", Micalb);
        //5
        expandableListDetail.put("Design and Analysis of Algorithms Lab", Daaal);
        //3
        expandableListDetail.put("Numerical Analysis", Numerical);
        return expandableListDetail;
    }
}
