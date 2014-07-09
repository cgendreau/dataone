### DataONE MemberNode 

> Note: This project is in an immature state

This is a project led by GBIF to help enable adopters to develop Java based DataONE Member Node stacks.

The project is structured as follows:
  1. dataone-api: Interfaces, schemas and a build that will generate JAXB classes from the schemas
  2. dataone-auth: Utilities to simplify handling of X509Certificates 
  3. dataone-membernode: The RESTful implementation built on Dropwizard* that can be extended with plugable backends
  4. dataone-membernode-hadoop: A runnable implementation that is backed by Hadoop technologies
  
* Dropwizard includes:
 - Jersey for REST
 - Yammer for Metrics
 
#### To build the project:

```
mvn package 
```

Once built, the next step would be to explore [the test configuration in](dataone-membernode/README.md)
