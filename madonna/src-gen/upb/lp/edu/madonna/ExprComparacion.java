/**
 * generated by Xtext 2.31.0
 */
package upb.lp.edu.madonna;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expr Comparacion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link upb.lp.edu.madonna.ExprComparacion#getOperadorComp <em>Operador Comp</em>}</li>
 *   <li>{@link upb.lp.edu.madonna.ExprComparacion#getExprComIzq <em>Expr Com Izq</em>}</li>
 *   <li>{@link upb.lp.edu.madonna.ExprComparacion#getExprComDer <em>Expr Com Der</em>}</li>
 * </ul>
 *
 * @see upb.lp.edu.madonna.MadonnaPackage#getExprComparacion()
 * @model
 * @generated
 */
public interface ExprComparacion extends EObject
{
  /**
   * Returns the value of the '<em><b>Operador Comp</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operador Comp</em>' attribute.
   * @see #setOperadorComp(String)
   * @see upb.lp.edu.madonna.MadonnaPackage#getExprComparacion_OperadorComp()
   * @model
   * @generated
   */
  String getOperadorComp();

  /**
   * Sets the value of the '{@link upb.lp.edu.madonna.ExprComparacion#getOperadorComp <em>Operador Comp</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Operador Comp</em>' attribute.
   * @see #getOperadorComp()
   * @generated
   */
  void setOperadorComp(String value);

  /**
   * Returns the value of the '<em><b>Expr Com Izq</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expr Com Izq</em>' containment reference.
   * @see #setExprComIzq(Expresion)
   * @see upb.lp.edu.madonna.MadonnaPackage#getExprComparacion_ExprComIzq()
   * @model containment="true"
   * @generated
   */
  Expresion getExprComIzq();

  /**
   * Sets the value of the '{@link upb.lp.edu.madonna.ExprComparacion#getExprComIzq <em>Expr Com Izq</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expr Com Izq</em>' containment reference.
   * @see #getExprComIzq()
   * @generated
   */
  void setExprComIzq(Expresion value);

  /**
   * Returns the value of the '<em><b>Expr Com Der</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expr Com Der</em>' containment reference.
   * @see #setExprComDer(Expresion)
   * @see upb.lp.edu.madonna.MadonnaPackage#getExprComparacion_ExprComDer()
   * @model containment="true"
   * @generated
   */
  Expresion getExprComDer();

  /**
   * Sets the value of the '{@link upb.lp.edu.madonna.ExprComparacion#getExprComDer <em>Expr Com Der</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expr Com Der</em>' containment reference.
   * @see #getExprComDer()
   * @generated
   */
  void setExprComDer(Expresion value);

} // ExprComparacion
