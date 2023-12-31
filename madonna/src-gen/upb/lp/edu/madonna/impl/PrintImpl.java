/**
 * generated by Xtext 2.31.0
 */
package upb.lp.edu.madonna.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import upb.lp.edu.madonna.MadonnaPackage;
import upb.lp.edu.madonna.Print;
import upb.lp.edu.madonna.Valor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Print</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link upb.lp.edu.madonna.impl.PrintImpl#getPrintTipo <em>Print Tipo</em>}</li>
 *   <li>{@link upb.lp.edu.madonna.impl.PrintImpl#getVal <em>Val</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PrintImpl extends DeclaracionImpl implements Print
{
  /**
   * The default value of the '{@link #getPrintTipo() <em>Print Tipo</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPrintTipo()
   * @generated
   * @ordered
   */
  protected static final String PRINT_TIPO_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPrintTipo() <em>Print Tipo</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPrintTipo()
   * @generated
   * @ordered
   */
  protected String printTipo = PRINT_TIPO_EDEFAULT;

  /**
   * The cached value of the '{@link #getVal() <em>Val</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVal()
   * @generated
   * @ordered
   */
  protected Valor val;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PrintImpl()
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
    return MadonnaPackage.Literals.PRINT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getPrintTipo()
  {
    return printTipo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setPrintTipo(String newPrintTipo)
  {
    String oldPrintTipo = printTipo;
    printTipo = newPrintTipo;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MadonnaPackage.PRINT__PRINT_TIPO, oldPrintTipo, printTipo));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Valor getVal()
  {
    return val;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVal(Valor newVal, NotificationChain msgs)
  {
    Valor oldVal = val;
    val = newVal;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MadonnaPackage.PRINT__VAL, oldVal, newVal);
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
  public void setVal(Valor newVal)
  {
    if (newVal != val)
    {
      NotificationChain msgs = null;
      if (val != null)
        msgs = ((InternalEObject)val).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MadonnaPackage.PRINT__VAL, null, msgs);
      if (newVal != null)
        msgs = ((InternalEObject)newVal).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MadonnaPackage.PRINT__VAL, null, msgs);
      msgs = basicSetVal(newVal, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MadonnaPackage.PRINT__VAL, newVal, newVal));
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
      case MadonnaPackage.PRINT__VAL:
        return basicSetVal(null, msgs);
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
      case MadonnaPackage.PRINT__PRINT_TIPO:
        return getPrintTipo();
      case MadonnaPackage.PRINT__VAL:
        return getVal();
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
      case MadonnaPackage.PRINT__PRINT_TIPO:
        setPrintTipo((String)newValue);
        return;
      case MadonnaPackage.PRINT__VAL:
        setVal((Valor)newValue);
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
      case MadonnaPackage.PRINT__PRINT_TIPO:
        setPrintTipo(PRINT_TIPO_EDEFAULT);
        return;
      case MadonnaPackage.PRINT__VAL:
        setVal((Valor)null);
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
      case MadonnaPackage.PRINT__PRINT_TIPO:
        return PRINT_TIPO_EDEFAULT == null ? printTipo != null : !PRINT_TIPO_EDEFAULT.equals(printTipo);
      case MadonnaPackage.PRINT__VAL:
        return val != null;
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
    result.append(" (printTipo: ");
    result.append(printTipo);
    result.append(')');
    return result.toString();
  }

} //PrintImpl
