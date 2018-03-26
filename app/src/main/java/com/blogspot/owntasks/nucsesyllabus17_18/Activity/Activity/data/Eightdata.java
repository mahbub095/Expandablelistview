package com.blogspot.owntasks.nucsesyllabus17_18.Activity.Activity.data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Mahbub on 25-Mar-18.
 */

public class Eightdata {
    public static HashMap<String, List<String>> getDataeig() {
        HashMap<String, List<String>> expandableListDetail = new HashMap<String, List<String>>();

        List<String> nis = new ArrayList<String>();
        nis.add("Fundamentals on information system security; Remote access technologies and vulnerabilities; accessibility; security for communication protocols; security for operating systems and mobile programs; security for electronic commerce, passwords and offline attacks; AAA, cryptography; network security applications: authentication, e-mail, IP and web; system security: intruders, malicious software and firewalls; PKI, smart cards, secure multipurpose internet mail extensions; security models; wireless security, sandboxing, router security strategies; security standards: data encryption standard (DES), RSA, digital signature algorithm (DSA), SHA, secure sockets layer(SSL), CBC, IPSec, AES and SET; denial of service (DOS) and distributed DOS attacks; steganography; implementing VPN; Security policy and management; network security assessment.");


        List<String> ism = new ArrayList<String>();
        ism.add("Information systems management: importance of information systems (IS) management, key trends that impacts IS Management, changes in organizational environment, changes in technology environments, IS organizational models, IS management's leadership role, New Roles of IT, Cox Model for IT management, Roger Woolfe’s Federal Model for outsourcing, CIO roles in leading, governing, investing and managing, strategic uses of IT in B2E, B2C, B2B, G2P, IS planning, IS planning paradox, differences between strategic, tactical and operational planning, today’s sense and response strategy, different planning techniques including stages of growth, critical success factors, competitive forces model, value chain analysis, internet value matrix, linkage analysis planning and scenario planning; Managing essential technologies: attributes of distributed systems, different types of distributed systems including host-based hierarchy, decentralized standalone systems, peer-to-peer system, hybrid enterprise wide systems, client-server systems, internet based computing and web services, Four levels of IT infrastructure, managing telecommunications, changes of infrastructure in telecommunications, transformation of telecommunication industries, wireless technology, managing information resources, managing data, giving shape to corporate data, enterprise resource planning, managing information resources, types of information, data warehouses, document management, content management, managing operations, outsourcing IS functions, information security, business continuity planning; Managing system development: foundation of system development, structured development, fourth generation language, software prototyping, computer-aided software engineering, object oriented development, ERP systems integration, middleware inter-organizational system development, project management, key issues of IS system management, designing motivational" +
                "works, rethinking maintenance works, improving legacy systems, measuring benefits of IS system as investment; Systems for supporting knowledge work: supporting decision-making, decision support systems, data mining, executive information systems, expert systems, real customer relationship management, real-time enterprise management, managing different types collaboration, groupware, virtual workforce, virtual organizations, knowledge management, intellectual capital issues, computer ethics and legal jurisdiction, information privacy, online contracting; Acquisition of hardware, software, networks, and services: request for proposal, acquisition methods (buy, rent, or lease) of software acquisition and analysis of alternatives among in-house development, outsourcing, purchasing and renting; People and technology: new work environment, organizing principles including self-organizing rather than designed, processes rather than functions, communities rather than groups, virtual rather than physical, learning organization, Internet mindset, value of role of networks, rules of networks, understanding users, executives understanding of IT, Technology camel.");

        List<String> Opc = new ArrayList<String>();
        Opc.add("Your College Will Be Select It");

        List<String> nislab = new ArrayList<String>();
        nislab.add("Networing Lab");

        List<String> oclab = new ArrayList<String>();
        oclab.add(" Your College Will Be Select It");

        List<String> pro = new ArrayList<String>();
        //  pro.add("Goldfinch novel set for big screen");


        //7
        expandableListDetail.put("Network and Information Security", nis);
        //2
        expandableListDetail.put("Information System Management", ism);
        //4
        expandableListDetail.put("Optional Course (any one)", Opc);
        //6
        expandableListDetail.put("Network and Information Security Lab", nislab);
        //1
        expandableListDetail.put("Optional Course Lab (Any one)", oclab);
        //5
        expandableListDetail.put("Project/Industry Attachment", pro);
        //3

        return expandableListDetail;
    }
}

