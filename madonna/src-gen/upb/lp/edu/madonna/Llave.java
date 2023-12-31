/**
 * generated by Xtext 2.31.0
 */
package upb.lp.edu.madonna;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Llave</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link upb.lp.edu.madonna.Llave#getExprLogCondicion <em>Expr Log Condicion</em>}</li>
 *   <li>{@link upb.lp.edu.madonna.Llave#getAcordeRes <em>Acorde Res</em>}</li>
 *   <li>{@link upb.lp.edu.madonna.Llave#getRep <em>Rep</em>}</li>
 * </ul>
 *
 * @see upb.lp.edu.madonna.MadonnaPackage#getLlave()
 * @model
 * @generated
 */
public interface Llave extends Expresion
{
  /**
   * Returns the value of the '<em><b>Expr Log Condicion</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expr Log Condicion</em>' containment reference.
   * @see #setExprLogCondicion(Expresion)
   * @see upb.lp.edu.madonna.MadonnaPackage#getLlave_ExprLogCondicion()
   * @model containment="true"
   * @generated
   */
  Expresion getExprLogCondicion();

  /**
   * Sets the value of the '{@link upb.lp.edu.madonna.Llave#getExprLogCondicion <em>Expr Log Condicion</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expr Log Condicion</em>' containment reference.
   * @see #getExprLogCondicion()
   * @generated
   */
  void setExprLogCondicion(Expresion value);

  /**
   * Returns the value of the '<em><b>Acorde Res</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Acorde Res</em>' containment reference.
   * @see #setAcordeRes(Expresion)
   * @see upb.lp.edu.madonna.MadonnaPackage#getLlave_AcordeRes()
   * @model containment="true"
   * @generated
   */
  Expresion getAcordeRes();

  /**
   * Sets the value of the '{@link upb.lp.edu.madonna.Llave#getAcordeRes <em>Acorde Res</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Acorde Res</em>' containment reference.
   * @see #getAcordeRes()
   * @generated
   */
  void setAcordeRes(Expresion value);

  /**
   * Returns the value of the '<em><b>Rep</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rep</em>' containment reference.
   * @see #setRep(Expresion)
   * @see upb.lp.edu.madonna.MadonnaPackage#getLlave_Rep()
   * @model containment="true"
   * @generated
   */
  Expresion getRep();

  /**
   * Sets the value of the '{@link upb.lp.edu.madonna.Llave#getRep <em>Rep</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rep</em>' containment reference.
   * @see #getRep()
   * @generated
   */
  void setRep(Expresion value);

} // Llave
