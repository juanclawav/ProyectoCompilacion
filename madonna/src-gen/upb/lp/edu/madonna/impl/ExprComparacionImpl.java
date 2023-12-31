/**
 * generated by Xtext 2.31.0
 */
package upb.lp.edu.madonna.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import upb.lp.edu.madonna.ExprComparacion;
import upb.lp.edu.madonna.Expresion;
import upb.lp.edu.madonna.MadonnaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expr Comparacion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link upb.lp.edu.madonna.impl.ExprComparacionImpl#getOperadorComp <em>Operador Comp</em>}</li>
 *   <li>{@link upb.lp.edu.madonna.impl.ExprComparacionImpl#getExprComIzq <em>Expr Com Izq</em>}</li>
 *   <li>{@link upb.lp.edu.madonna.impl.ExprComparacionImpl#getExprComDer <em>Expr Com Der</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExprComparacionImpl extends MinimalEObjectImpl.Container implements ExprComparacion
{
  /**
   * The default value of the '{@link #getOperadorComp() <em>Operador Comp</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperadorComp()
   * @generated
   * @ordered
   */
  protected static final String OPERADOR_COMP_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getOperadorComp() <em>Operador Comp</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperadorComp()
   * @generated
   * @ordered
   */
  protected String operadorComp = OPERADOR_COMP_EDEFAULT;

  /**
   * The cached value of the '{@link #getExprComIzq() <em>Expr Com Izq</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExprComIzq()
   * @generated
   * @ordered
   */
  protected Expresion exprComIzq;

  /**
   * The cached value of the '{@link #getExprComDer() <em>Expr Com Der</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExprComDer()
   * @generated
   * @ordered
   */
  protected Expresion exprComDer;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExprComparacionImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return MadonnaPackage.Literals.EXPR_COMPARACION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getOperadorComp()
  {
    return operadorComp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setOperadorComp(String newOperadorComp)
  {
    String oldOperadorComp = operadorComp;
    operadorComp = newOperadorComp;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MadonnaPackage.EXPR_COMPARACION__OPERADOR_COMP, oldOperadorComp, operadorComp));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Expresion getExprComIzq()
  {
    return exprComIzq;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExprComIzq(Expresion newExprComIzq, NotificationChain msgs)
  {
    Expresion oldExprComIzq = exprComIzq;
    exprComIzq = newExprComIzq;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MadonnaPackage.EXPR_COMPARACION__EXPR_COM_IZQ, oldExprComIzq, newExprComIzq);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setExprComIzq(Expresion newExprComIzq)
  {
    if (newExprComIzq != exprComIzq)
    {
      NotificationChain msgs = null;
      if (exprComIzq != null)
        msgs = ((InternalEObject)exprComIzq).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MadonnaPackage.EXPR_COMPARACION__EXPR_COM_IZQ, null, msgs);
      if (newExprComIzq != null)
        msgs = ((InternalEObject)newExprComIzq).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MadonnaPackage.EXPR_COMPARACION__EXPR_COM_IZQ, null, msgs);
      msgs = basicSetExprComIzq(newExprComIzq, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MadonnaPackage.EXPR_COMPARACION__EXPR_COM_IZQ, newExprComIzq, newExprComIzq));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Expresion getExprComDer()
  {
    return exprComDer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExprComDer(Expresion newExprComDer, NotificationChain msgs)
  {
    Expresion oldExprComDer = exprComDer;
    exprComDer = newExprComDer;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MadonnaPackage.EXPR_COMPARACION__EXPR_COM_DER, oldExprComDer, newExprComDer);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setExprComDer(Expresion newExprComDer)
  {
    if (newExprComDer != exprComDer)
    {
      NotificationChain msgs = null;
      if (exprComDer != null)
        msgs = ((InternalEObject)exprComDer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MadonnaPackage.EXPR_COMPARACION__EXPR_COM_DER, null, msgs);
      if (newExprComDer != null)
        msgs = ((InternalEObject)newExprComDer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MadonnaPackage.EXPR_COMPARACION__EXPR_COM_DER, null, msgs);
      msgs = basicSetExprComDer(newExprComDer, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MadonnaPackage.EXPR_COMPARACION__EXPR_COM_DER, newExprComDer, newExprComDer));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case MadonnaPackage.EXPR_COMPARACION__EXPR_COM_IZQ:
        return basicSetExprComIzq(null, msgs);
      case MadonnaPackage.EXPR_COMPARACION__EXPR_COM_DER:
        return basicSetExprComDer(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case MadonnaPackage.EXPR_COMPARACION__OPERADOR_COMP:
        return getOperadorComp();
      case MadonnaPackage.EXPR_COMPARACION__EXPR_COM_IZQ:
        return getExprComIzq();
      case MadonnaPackage.EXPR_COMPARACION__EXPR_COM_DER:
        return getExprComDer();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MadonnaPackage.EXPR_COMPARACION__OPERADOR_COMP:
        setOperadorComp((String)newValue);
        return;
      case MadonnaPackage.EXPR_COMPARACION__EXPR_COM_IZQ:
        setExprComIzq((Expresion)newValue);
        return;
      case MadonnaPackage.EXPR_COMPARACION__EXPR_COM_DER:
        setExprComDer((Expresion)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case MadonnaPackage.EXPR_COMPARACION__OPERADOR_COMP:
        setOperadorComp(OPERADOR_COMP_EDEFAULT);
        return;
      case MadonnaPackage.EXPR_COMPARACION__EXPR_COM_IZQ:
        setExprComIzq((Expresion)null);
        return;
      case MadonnaPackage.EXPR_COMPARACION__EXPR_COM_DER:
        setExprComDer((Expresion)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case MadonnaPackage.EXPR_COMPARACION__OPERADOR_COMP:
        return OPERADOR_COMP_EDEFAULT == null ? operadorComp != null : !OPERADOR_COMP_EDEFAULT.equals(operadorComp);
      case MadonnaPackage.EXPR_COMPARACION__EXPR_COM_IZQ:
        return exprComIzq != null;
      case MadonnaPackage.EXPR_COMPARACION__EXPR_COM_DER:
        return exprComDer != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (operadorComp: ");
    result.append(operadorComp);
    result.append(')');
    return result.toString();
  }

} //ExprComparacionImpl
