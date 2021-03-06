package edu.pitt.dbmi.ohdsiv5.db;
// Generated Aug 25, 2010 7:48:41 AM by Hibernate Tools 3.1.0.beta4
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * ConceptAncestor generated by hbm2java
 */
@Entity
@Table(name="CONCEPT_ANCESTOR", uniqueConstraints = {  })

public class ConceptAncestor  implements java.io.Serializable {


    // Fields   
     private Integer ancestorConceptId;
     private Integer descendantConceptId;
     private Short maxLevelsOfSeparation;
     private Short minLevelsOfSeparation;


    // Constructors

    /** default constructor */
    public ConceptAncestor() {
    }

	/** minimal constructor */
    public ConceptAncestor(Integer ancestorConceptId, Integer descendantConceptId) {
        this.ancestorConceptId = ancestorConceptId;
        this.descendantConceptId = descendantConceptId;
    }
    
    /** full constructor */
    public ConceptAncestor(Integer ancestorConceptId, Integer descendantConceptId, Short maxLevelsOfSeparation, Short minLevelsOfSeparation) {
        this.ancestorConceptId = ancestorConceptId;
        this.descendantConceptId = descendantConceptId;
        this.maxLevelsOfSeparation = maxLevelsOfSeparation;
        this.minLevelsOfSeparation = minLevelsOfSeparation;
    }
   
    // Property accessors
    @Id
    @Column(name="ANCESTOR_CONCEPT_ID", unique=false, nullable=false, insertable=true, updatable=true, precision=8, scale=0)

    public Integer getAncestorConceptId() {
        return this.ancestorConceptId;
    }
    
    public void setAncestorConceptId(Integer ancestorConceptId) {
        this.ancestorConceptId = ancestorConceptId;
    }
    @Column(name="DESCENDANT_CONCEPT_ID", unique=false, nullable=false, insertable=true, updatable=true, precision=8, scale=0)

    public Integer getDescendantConceptId() {
        return this.descendantConceptId;
    }
    
    public void setDescendantConceptId(Integer descendantConceptId) {
        this.descendantConceptId = descendantConceptId;
    }
    @Column(name="MAX_LEVELS_OF_SEPARATION", unique=false, nullable=true, insertable=true, updatable=true, precision=3, scale=0)

    public Short getMaxLevelsOfSeparation() {
        return this.maxLevelsOfSeparation;
    }
    
    public void setMaxLevelsOfSeparation(Short maxLevelsOfSeparation) {
        this.maxLevelsOfSeparation = maxLevelsOfSeparation;
    }
    @Column(name="MIN_LEVELS_OF_SEPARATION", unique=false, nullable=true, insertable=true, updatable=true, precision=3, scale=0)

    public Short getMinLevelsOfSeparation() {
        return this.minLevelsOfSeparation;
    }
    
    public void setMinLevelsOfSeparation(Short minLevelsOfSeparation) {
        this.minLevelsOfSeparation = minLevelsOfSeparation;
    }
   








}
