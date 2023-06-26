/**
 * generated by Xtext 2.31.0
 */
package upb.lp.edu.madonna;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Asignacion Nota</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link upb.lp.edu.madonna.AsignacionNota#getName <em>Name</em>}</li>
 *   <li>{@link upb.lp.edu.madonna.AsignacionNota#getVal <em>Val</em>}</li>
 * </ul>
 *
 * @see upb.lp.edu.madonna.MadonnaPackage#getAsignacionNota()
 * @model
 * @generated
 */
public interface AsignacionNota extends Declaracion
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see upb.lp.edu.madonna.MadonnaPackage#getAsignacionNota_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link upb.lp.edu.madonna.AsignacionNota#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Val</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Val</em>' reference.
   * @see #setVal(Nota)
   * @see upb.lp.edu.madonna.MadonnaPackage#getAsignacionNota_Val()
   * @model
   * @generated
   */
  Nota getVal();

  /**
   * Sets the value of the '{@link upb.lp.edu.madonna.AsignacionNota#getVal <em>Val</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Val</em>' reference.
   * @see #getVal()
   * @generated
   */
  void setVal(Nota value);

} // AsignacionNota
