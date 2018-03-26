package com.blogspot.owntasks.nucsesyllabus17_18.Activity.Activity.data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Mahbub on 25-Mar-18.
 */

public class Sevendata {
    public static HashMap<String, List<String>> getDatasev() {
        HashMap<String, List<String>> expandableListDetail = new HashMap<String, List<String>>();

        List<String>  arti = new ArrayList<String>();
        arti.add("Overview of Al, AI programming language: Prolog, Environment Types, Agent Types, Agent Model, Reactive Agents, Perceptron: Neurons – Biological and Artificial, Perceptron Learning, Linear Separability, Multi-Layer Networks,Problem solving and searching: 8-puzzle problem, N-queen problem, general search, Review of Un-Informed Search Strategies: breadth first search, uniform cost search, depth-first search, iterative deepening, bidirectional search; Informed search algorithms: best-first search, A* search, Heuristic searching, Memory Bounded Search (e.g. IDA*); Local Searches: Hill Climbing, Simulated Annealing, Constraint Satisfaction Problems. Genetic Algorithm. Motion planning: motion planning search, configuration, action and obstacle, Road map, Game Theory: motivation, minmax search, resource limits and heuristic evaluation, α-β pruning, stochastic games, partially observable games, Neural Networks: Multi-Layer Neural Networks, Backpropagation, Variations on Backprop, Cross Entropy, Weight Decay, Momentum, Machine Learning: Supervised Learning, Decision Trees, Reinforcement Learning, General concepts of knowledge, Knowledge representation, frame problem, representing time, events and actions, Utility theory. Logical Agent: Knowledge-based agents, Logic in general—models and entailment, Propositional (Boolean) logic, Equivalence, validity, satisfiability, Inference rules and theorem proving, forward chaining, backward chaining, resolution, First order Logic: Universal and Existential Quantifiers, Keeping Track of Change, Inference in first order logic Planning.");


        List<String> comdc = new ArrayList<String>();
        comdc.add("Phases of a compiler and compiling techniques; the grammar of programming languages; lexical analyzers, parsers, code emitters and interpretations; syntax analysis: context free grammars, top-down parsing, LL(1), recursive descent parsing, bottom-up parsing, LR(0), SLR(1), LR(1) and LALR(1) parsing; syntax error recovery; syntax directed translation; semantic analysis; type-checking; run time support; error management; intermediate code generation; code generation; code optimization; control flow graphs: loops and code motion; data flow analysis; optimization for memory hierarchies.");

        List<String> cgra = new ArrayList<String>();
        cgra.add("Graphics hardware: display and input devices; raster graphics concept: architecture, algorithms and other image synthesis methods; design of interactive graphic conversations; architecture of display devices and connectivity to a computer; scan conversion algorithms for line, circle and ellipse drawing; implementation of graphics concepts of two-dimensional and three-dimensional viewing, clipping and transformations; hidden line elimination algorithms; three-dimensional object representations: polygon surface, B-Spline curves and surfaces, BSP trees, Octrees, Fractal-Geometry methods; visible surface detection methods: Z-buffer method, ray casting method; illumination models; surface rendering methods: polygon rendering, ray tracing, terrain visualization with height mapping, modeling surface details with texture mapping; color models; computer animation");

        List<String> ecomw = new ArrayList<String>();
        ecomw.add("Vision and mission of e-Government; status affecting e-Government development; Principles of e-Government strategy; current issues and trends in e-government; ways the Internet can improve government's responsiveness; identifying career requirements for e-government services; web site management; implications of public private partnerships; e-Government policy frameworks; development of portal architecture;key e-government practices; citizen centric web design; e-government legal/social drivers; e-Government policy issues; the management of strategy and projects; data security; quality assurance; political challenges and ethical challenges; security issues and the need for a certification authority; delivery channels and service delivery; capacity building and business process re-engineering; e-Government service branding and communications strategy; e-Government financing; comparative case study of e-Government implementation and program structures; Unicode and ICT in local languages; issues in transliteration and natural language translation; records management; service oriented architecture; IT workforce; concepts in bridging the digital divide; working with donors; models of public-private partnerships (PPP); application scenarios for G2G, G2B and G2C; emergence of new e-sectors such as e-Health, e-Water & e-Tourism; ICT for democracy and development; transparency and right to information; proprietary vs. open source software; e-literacy and illiteracy; Categories of e-Business (b2b, b2c, b2a etc); electronic markets; electronic data interchange; internet commerce; e-Business planning; business and operational aspects of e-Business; data warehousing, data mining and intelligent agents; electronic payment; cryptography techniques for payment systems; systems based on credit cards; electronic checks; electronic cash payment systems; micro payments.");

        List<String> ailabb = new ArrayList<String>();
        ailabb.add("Objectives: Laboratory assignments will be based on the Course CSE 540201. Lab assignments includebasic AI technologies and algorithms using non procedural programming languages, e.g., LISP and/or PROLOG");

        List<String> colab = new ArrayList<String>();
        colab.add("Laboratory classes will be based on the Course CSE 540203. Lab assignments will include but not limited to: design of simple lexical analyzer, design of recursive descent parser, use of the compiler design tools e.g. LEX and YACC to implement different syntax directed translations and designing and implementing a complete compiler, for target machines such as x86 or MIPS like machines, grammar of a simple but complete language. Simple optimizations techniques should be included");


        List<String> comgraplab = new ArrayList<String>();
        comgraplab.add("Laboratory classes will be designed based on CSE 540205 course. The main target of this lab is to make the students familiar with the underlying phenomenon of graphical rendering, which will help them to be a good graphics engineer. Rendering is to be done using the basic concept of polygon filling, Z-buffering, shading and scan conversion algorithm. The students will also be able to write simple programs for animation of their own");

        List<String> ecomlab = new ArrayList<String>();
        ecomlab.add("Objectives: Using three tier MVC model and based on J2EE application platform, students will be asked to develop E-Commerce (Internet Application) based projects. Usually a large project will be divided into smaller parts and asked to implement step by step in J2EE application platform. Students should develop an example project at the end.");



        //7
        expandableListDetail.put("Artificial Intelligence", arti);
        //2
        expandableListDetail.put("Compiler Design and Construction", comdc);
        //4
        expandableListDetail.put("Computer Graphics", cgra);
        //6
        expandableListDetail.put("E-Commerce and Web Engineering", ecomw);
        //1
        expandableListDetail.put("Artificial Intelligence Lab", ailabb);
        //5
        expandableListDetail.put("Compiler Design Lab", colab);
        //3
        expandableListDetail.put("Computer Graphics Lab", comgraplab);
        expandableListDetail.put("E-Commerce and Web Engineering Lab", ecomlab);
        return expandableListDetail;
    }
}
