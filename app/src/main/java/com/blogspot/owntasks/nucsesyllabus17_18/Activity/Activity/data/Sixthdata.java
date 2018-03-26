package com.blogspot.owntasks.nucsesyllabus17_18.Activity.Activity.data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Mahbub on 25-Mar-18.
 */

public class Sixthdata {
    public static HashMap<String, List<String>> getDatasixth() {
        HashMap<String, List<String>> expandableListDetail = new HashMap<String, List<String>>();

        List<String> se = new ArrayList<String>();
        se.add("The Product and the Process: the Product, the Process. Managing Software Projects: Project Management Concepts, Software Process and Project Metrics, Software Project Planning, Risk Analysis and Management, Project Scheduling and Tracking, Software Quality Assurance, Software Configuration Management. Conventional Methods for Software Engineering: System Engineering, Analysis Concepts and Principles, Analysis Modeling, Design Concepts and Principles, Architectural Design, User Interface Design, Component-Level Design, Software Testing Techniques, Software Testing Strategies, Software Metrics. Object Oriented Software Engineering: Object-Oriented Concepts and Principles, Object-Oriented Analysis, Object-Oriented Design, Object-Oriented Testing. Advanced Topics in Software Engineering: Formal Methods, Cleanroom Software Engineering, Component-Based Software Engineering, Client/Server Software Engineering, Web Engineering, Reengineering, Computer-Aided Software Engineering.");


        List<String> comn = new ArrayList<String>();
        comn.add("Network architectures – layered architectures; ISO reference model: data link protocols, error control, HDLC, X.25, flow and congestion control, virtual terminal protocol, data security and MAC addressing; local area networks, satellite networks, packet radio networks; introduction to ARPANET, SNA and DECNET; Networking devices: hub, switch, bridge and router; LAN; wireless LAN; WAN; MAN; IEEE 802.*; FDDI; routing algorithm; congestion control; internetworking; firewalls; IPv4, IPv6, ARP, RARP and mobile IP; IP addressing; network layer of ATM; transport protocols; transmission control protocol; connection management, transmission policy, congestion control, timer management; TCP and UDP; AAL of ATM; cellular networks; network security: cryptography, DES, IDEA, public key algorithm; authentication; digital signatures; gigabit Ethernet; domain name system: name servers; email and its privacy; SNMP; HTTP; www; FTP; proxy server;");

        List<String> tocom = new ArrayList<String>();
        tocom.add("Language theory; finite automata: deterministic finite automata, nondeterministic finite automata, equivalence and conversion of deterministic and nondeterministic finite automata, pushdown automata; regular expressions and its properties: Chomsky hierarchy, regular grammar and regular language; context free languages; context free grammars; Pumping lemma and its applications; Turing machines: basic machines, configuration, computing with Turing machines, combining Turing machines; Mealy machine and Moore machine; undecidability: diagonalization method, halting problem, undecidable problems from language theory and reducibility; recursive theorem;");

        List<String> espro = new ArrayList<String>();
        espro.add("Concept of visual programming; system programming concepts; general machine structures; Internet programming; environments; multiple document interfaces; ActiveX controls and ActiveX components; API; apache server; OLE automation; database programming and Active data objects; introduction to the web; scripting objects; active server pages; database connectivity to web applications; adding dynamic content to web applications; programming common gateway interfaces; programming the user interface for the web applications;programming with concurrency and multithreading; service-oriented software development; XML and related technologies: XML schema XSLT, XPath, DOM, SAX; web-based application development and state management; Kernel programming; programming for memory management; VFS handling; interrupt handling; Linux module programming; assembler: basic functions, machine dependent and independent assembler, one vs. multipass assembler; linker: dynamic lining and linking editors, loaders: machine dependent and independent loader, bootstrap loaders, development of system software and web-based applications for different devices.");

        List<String> softlab = new ArrayList<String>();
        softlab.add("Based on Software Engineering Lab Theory Course CSE 530213");

        List<String> comnlan = new ArrayList<String>();
        comnlan.add("Laboratory classes are based on course CSE 530215. Starting with application layer, students will configure different services at different layers and examine their messaging techniques. Students will also develop some experiments to work transport layer services such as TCP and UDP");


        List<String> esplab= new ArrayList<String>();
        esplab.add("Laboratory classes are based on course CSE 530219.Students will get knowledge for developing some system tools based on various system calls. Linux module programming will be an important part of this lab. They will be asked to develop device drivers and applications programs for different devices.");


        //7
        expandableListDetail.put("Software Engineering", se);
        //2
        expandableListDetail.put("Computer Networking", comn);
        //4
        expandableListDetail.put("Theory of Computation", tocom);
        //6
        expandableListDetail.put("Embedded System Programming", espro);
        //1
        expandableListDetail.put("Software EngineeringLab", softlab);
        //5
        expandableListDetail.put("Computer Networking Lab", comnlan);
        //3
        expandableListDetail.put("Embedded System Programming Lab", esplab);
        return expandableListDetail;
    }
}

