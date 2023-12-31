/**
 * generated by Xtext 2.31.0
 */
package upb.lp.edu.madonna;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expr Concatenacion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link upb.lp.edu.madonna.ExprConcatenacion#getOperadorCon <em>Operador Con</em>}</li>
 *   <li>{@link upb.lp.edu.madonna.ExprConcatenacion#getExprCon <em>Expr Con</em>}</li>
 * </ul>
 *
 * @see upb.lp.edu.madonna.MadonnaPackage#getExprConcatenacion()
 * @model
 * @generated
 */
public interface ExprConcatenacion extends Expresion
{
  /**
   * Returns the value of the '<em><b>Operador Con</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operador Con</em>' attribute.
   * @see #setOperadorCon(String)
   * @see upb.lp.edu.madonna.MadonnaPackage#getExprConcatenacion_OperadorCon()
   * @model
   * @generated
   */
  String getOperadorCon();

  /**
   * Sets the value of the '{@link upb.lp.edu.madonna.ExprConcatenacion#getOperadorCon <em>Operador Con</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Operador Con</em>' attribute.
   * @see #getOperadorCon()
   * @generated
   */
  void setOperadorCon(String value);

  /**
   * Returns the value of the '<em><b>Expr Con</b></em>' containment reference list.
   * The list contents are of type {@link upb.lp.edu.madonna.Expresion}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expr Con</em>' containment reference list.
   * @see upb.lp.edu.madonna.MadonnaPackage#getExprConcatenacion_ExprCon()
   * @model containment="true"
   * @generated
   */
  EList<Expresion> getExprCon();

} // ExprConcatenacion
