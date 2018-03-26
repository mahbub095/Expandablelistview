package com.blogspot.owntasks.nucsesyllabus17_18.Activity.Activity.data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Mahbub on 25-Mar-18.
 */

public class Thirddata {
    public static HashMap<String, List<String>> getDataTh() {
        HashMap<String, List<String>> expandableListDetail = new HashMap<String, List<String>>();

        List<String> datastru = new ArrayList<String>();
        datastru.add("Internal data representation; abstract and elementary data types; elementary data structures; array: 1D and multidimensional array; pointers and link list: single, double and circular linked list; stack; queue: basic, circular and priority queue; recursion; graph and graph traversal techniques; tree: n-ary tree, binary search tree, B-tree, B+ tree, B* tree and balanced tree; heap; reverse polish notation and expression evaluation: in-order, pre-order and post-order;" +
                "hashing and indexing techniques; sorting; searching, storage management");


        List<String> oop = new ArrayList<String>();
        oop.add("Philosophy of object oriented programming (OOP); advantages of OOP over structured programming; encapsulation; constructors, destructors and copy constructors; array of objects, object pointers and object references; inheritance: single and multiple inheritance; polymorphism: overloading, abstract classes, virtual functions and overriding; packages and interfaces; exception handling; object oriented I/O; template functions and classes; multi-threaded programming; enumerations, autoboxing and annotations; template functions and generic classes; string handling; java.lang, java.util and java.io; networking; AWT; layout management and menus; GUI and Event-driven programming;" +
                "concurrency utilities; java beans; swing; Applets and Servlets");


        List<String> ca = new ArrayList<String>();
        ca.add("Basic components of a computer and a microprocessor,types of components: registers, control section and ALU. Digital Design Basics: Data representation: Fixed and Floating point (IEEE754) number representations, Arithmetic Circuits: Adders, Subtractors& overflow, Magnitude Comparator, Other Basic Constructs: Decoder, Multiplexers etc. Flip-Flops and Latches, Register & Register Files, Sequential Circuits: Finite State Machine(FSM) representation, Serial Adder, Synchronous Counter Design, Timing Methodology. Introduction to Processor Architecture: The basic Accumulator based CPU: organization, instruction set, programming considerations, RISC & CISC Processors: Instruction Sets, Addressing Modes, Introduction to the Basic MIPS Instruction Set. Arithmetic Circuits: Fast adders: Carry Look Ahead adders, Carry Save adder, Multipliers/Dividers: Booth’s algorithm, restoring/non-restoring division, Array multipliers, Divider arrays. Fixed Point ALUs: Combinational and Sequential ALUs, ALU Expansion. Pipelined Processing: Pipelined Multipliers, Carry Save Adders & Multipliers, Systolic Arrays. Datapath& Control Design: Single Cycle and Multi-cycle implementation of a Subset of the MIPS instruction set, the FSM control for datapath, Hardwired and Micro-programmed Control Design, Pipelined Datapath& Pipeline control, Data and Control Hazards, Pipeline Performance. Cache Memory: Associative & Direct mapping, Set associative Caches, performance measurements. System Organization: Buses, Bus arbitration, I/O Control, Interrupts and Direct Memory Access.");

        List<String> dastlab = new ArrayList<String>();
        dastlab.add("Laboratory classes are based on course CSE 520201. Students will be able to implement different data structures, like array, string, linked list, tree and graph using C/C++ programming language. They will be introduced with different sorting algorithms and advanced data structures such as heap, Fibonacci heap, storage management");

        List<String> oopl = new ArrayList<String>();
        oopl.add("Laboratory classes are based on course CSE 520203. The goal of this lab is to provide students with the skills needed to effectively design, develop, implement, debug, test, and maintain object oriented programs and more generally to solve problems using C++ and Java programming languages. They will exercise different advanced programming techniques of JAVA, like swing, socket programming, and windows programming. At the end of the course, students will have to develop a simple real-life programming project.");


        List<String> oda = new ArrayList<String>();
        oda.add("Ordinary differential equations and their solutions : Classification of differential equations. Solutions. Implicit solutions. Singular solutions. Initial value problems, boundary value problems. Basic existence and uniqueness theorems (statement and illustration only). Direction fields. phase line. Solution of first order equations : Separable equations and equations reducible to this form. Linear equations, exact equations, Special integrating factors, Substitutions and transformations. Modeling with first order differential equations: Constructions of differential equations as mathematical models (exponential growth and decay,heating and cooling, mixture of solutions, series circuit, logistic growth, chemical reaction, falling bodies). model solutions and interpretation of results. orthogonal and oblique trajectories. Solutions of higher order linear differential equations : Linear differential operators. Basic theory of linear differential equations. Solution space of homogeneous systems. Reduction of order. Homogeneous linear equations with constant coefficient. Non homogeneous equation. Method of undetermined coefficient. Variation of parameters. Euler-cauchy differential equations. Modeling with second-order equations : Vibration of a mass on a spring, free and undamped motion; free and damped motion; forced motionresonance phenomena; electric problems; motion of a rocker.");


        List<String> fabs = new ArrayList<String>();
        fabs.add("The Business Enterprise: Foundation of Business & Economics, Forms of Business Ownership, Entrepreneurship, Franchising and Small Business, International Business. The Environment of Business: Social responsibility and Business Ethics, Business Law and Government. Management and Organization: Fundamentals of Management, Organization of Business, Managing production and operation. Human Resources: Human Relations and Motivation, Managing Human Resources, Labor Management Relations. Marketing: Marketing Strategies, Product & Price, Distribution and Promotion, Financial Management: Money and Banking, Financial Management, Investment & Personal Finance, Risk Management and Insurance. Accounting and Information Systems: Accounting Fundamentals, Computer and Management Information Systems.");




        //7
        expandableListDetail.put("Data Structure", datastru);
        //2
        expandableListDetail.put("Object Oriented Programming", oop);
        //4
        expandableListDetail.put("Computer Architecture", ca);
        //6
        expandableListDetail.put("Data Structure Lab", dastlab);
        //1
        expandableListDetail.put("Object Oriented Programming Lab", oopl);
        //5
        expandableListDetail.put("Ordinary Differential Equation", oda);
        //3
        expandableListDetail.put("Fundament of Business Studies", fabs);
        return expandableListDetail;
    }
}

