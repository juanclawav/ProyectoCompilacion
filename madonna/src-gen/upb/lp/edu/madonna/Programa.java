/**
 * generated by Xtext 2.31.0
 */
package upb.lp.edu.madonna;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Programa</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link upb.lp.edu.madonna.Programa#getName <em>Name</em>}</li>
 *   <li>{@link upb.lp.edu.madonna.Programa#getProg <em>Prog</em>}</li>
 * </ul>
 *
 * @see upb.lp.edu.madonna.MadonnaPackage#getPrograma()
 * @model
 * @generated
 */
public interface Programa extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see upb.lp.edu.madonna.MadonnaPackage#getPrograma_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link upb.lp.edu.madonna.Programa#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Prog</b></em>' containment reference list.
   * The list contents are of type {@link upb.lp.edu.madonna.Instrucciones}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Prog</em>' containment reference list.
   * @see upb.lp.edu.madonna.MadonnaPackage#getPrograma_Prog()
   * @model containment="true"
   * @generated
   */
  EList<Instrucciones> getProg();

} // Programa
