A graph based data and processing model for text

Author: Ronald Haentjens Dekker  
Date: 26-12-2016  
Goal: Specification document meant as a guide line for implementations  
Status: WORK IN PROGRESS!   
Based on concepts and ideas behind the LMNL markup language and the Alexandria text repository project.

LMNL data model

LMNL documents contain text. Text can have ranges on them. Ranges can overlap. Ranges can be annotated on either the start tag or the end tag. Annotations can contain text themselves, that can have ranges, that can have annotations etc. Annotations can be annotated. Annotations on a range are ordered. 



Text Graph Datamodel:  

A text graph representing all the data contained in a LMNL document consists of both a directed acyclic graph (DAG) and a hypergraph (HG).
The DAG contains all the range nodes, the annotation nodes, all the edges between them, and all the text nodes and the edges between them.
The HG contains all the hyperedges between the text nodes and the range nodes representing the many to many relation between them.
I.e. a text node has zero or more ranges on it, while a range can have zero or more text nodes associated with it. A range can be annotated. An annotation can itself be annotated.


Definitions

* Document node  
 TODO: add description 

* Text node  
 TODO: add description 

* Range node  
 TODO: add description 

* Annotation node   
 TODO: add description


* Directed Acyclic Graph  
 TODO: add description

* Hypergraph  
 TODO: add description  
 
 Implementation detail: Property graph databases like Neo4J do not support hyperedges. However a hyperedge can be emulated by adding a note to the graph representing the edge and then adding all the members to it.
 
 Implementation detail: A hypergraph can be represented by a biparte graph. In other words it can be represented by a biadjacency matrix, implemented as an array of bit arrays. 
 
* Annotation edge  
 TODO: add description  

* Text edge  
 TODO: add description

* Range - Text nodes hyperedge  
 TODO: add description

Example LMNL:  

Taken from Wendell's paper "Luminescent: parsing LMNL by XSLT upconversion"

```
[excerpt
  [source [date}1915{][title}The Housekeeper{]]
  [author
    [name}Robert Frost{]
    [dates}1874-1963{]] }
[s}[l [n}144{n]}He manages to keep the upper hand{l]
[l [n}145{n]}On his own farm.{s] [s}He's boss.{s] [s}But as to hens:{l]
[l [n}146{n]}We fence our flowers in and the hens range.{l]{s]
{excerpt]
```

Conversion:  


Goal: treat all textual concent the same on a conceptual level. Implementations can make various optimizations.

 
Text nodes:  

Note: ID's are assigned arbitrarly and are only used for the purpose of making references to the IDed node in this document.  

0. ID: ATC1; "1915"
1. ID: ATC2; "The Housekeeper"
2. ID: ATC3; "Robert Frost"
3. ID: ATC4; "1874-1963"
0. ID: WS1; WS/New line only text node
0. ID: ATC5; "144"
1. ID: TC1; "He manages to keep the upper hand"
2. ID: WS2; WS/New line only text node
2. ID: ATC6; "145" 
2. ID: TC2; "On his own farm"
3. ID: WS3; " " whitespace only text node
4. ID: TC3; "He's boss."
5. ID: WS4; " " whitespace only text node
6. ID: TC4; "But as to hens:" 
7. ID: WS5; New line only text node
8. ID: ATC7; "146"
7. ID: TC5; "We fence our flowers in and the hens range."
8. ID: WS6; New line only text node

Range nodes:  

1. ID EXC; Node for tag "excerpt"
8. ID S1; Node for tag "s"
9. ID L1; Node for tag "l"
11. ID l2; Node for tag "l"
2. ID S2; Node for tag "s"
3. ID S3; Node for tag "s"
12. ID l3; Node for tag "l"


Annotation nodes:

2. Node for tag "source"
3. Node for tag "date" 
4. Node for tag "title" 
5. Node for tag "author"
6. Node for tag "name" 
7. Node for tag "dates"
10. Node for tag "n" 
1. Node for tag "n" 
13. Node for tag "n" 


  
Edges:   

1. Annotation edge to connect 1 and 2
2. Annotation edge to connect 2 and 3
3. Annotation edge to connect 4 and 2
4. TODO: lots of edges to add
6. 

TODO: add edges between text nodes to the record order of the text.
TODO: add edges between nodes on annotations of the same annotation (annotations are order in LMNL)


Example repeated here for clarity:

```
[excerpt
  [source [date}1915{][title}The Housekeeper{]]
  [author
    [name}Robert Frost{]
    [dates}1874-1963{]] }
[s}[l [n}144{n]}He manages to keep the upper hand{l]
[l [n}145{n]}On his own farm.{s] [s}He's boss.{s] [s}But as to hens:{l]
[l [n}146{n]}We fence our flowers in and the hens range.{l]{s]
{excerpt]
```

Text -> Range nodes hyperedges:

1. HE connecting WS1 with [excerpt].
2. HE connecting TC1 with [excerpt, s1, l1].
1. HE connecting WS2 with [excerpt, s1].
2. HE connecting TC2 with [excerpt, s1, l2].
3. HE connecting WS3 with [excerpt, l2].
3. HE connecting TC3 with [excerpt, s2, l2].
4. HE connecting WS4 with [excerpt, l2].
4. HE connecting TC4 with [excerpt, s3, l2].
4. HE connecting WS5 with [excerpt, s3].
5. HE connecting TC5 with [excerpt, s3, l3].
6. HE connecting WS6 with [excerpt].
 

