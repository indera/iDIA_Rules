package edu.pitt.dbmi.ohdsiv5.db;
// Generated Jun 15, 2010 5:42:31 PM by Hibernate Tools 3.1.0.beta4

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;


/**
 * DoiAncestor generated by hbm2java
 */
@Entity
@Table(name="DOI_ANCESTOR")

public class DoiAncestor  implements java.io.Serializable {


    // Fields    

     private Long id;


    // Constructors

    /** default constructor */
    public DoiAncestor() {
    }

    
    /** full constructor */
    public DoiAncestor(Long id) {
        this.id = id;
    }
    

   
    // Property accessors
    @EmbeddedId
    @AttributeOverrides( {
        @AttributeOverride(name="doiConceptId", column=@Column(name="DOI_CONCEPT_ID", unique=false, nullable=false, insertable=true, updatable=true, precision=15, scale=0) ), 
        @AttributeOverride(name="descendentConceptId", column=@Column(name="DESCENDENT_CONCEPT_ID", unique=false, nullable=false, insertable=true, updatable=true, precision=15, scale=0) ) } )

    public Long getId() {
        return this.id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
   








}
