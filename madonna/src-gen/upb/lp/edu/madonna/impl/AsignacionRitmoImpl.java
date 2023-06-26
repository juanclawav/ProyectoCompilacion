/**
 * generated by Xtext 2.31.0
 */
package upb.lp.edu.madonna.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import upb.lp.edu.madonna.AsignacionRitmo;
import upb.lp.edu.madonna.MadonnaPackage;
import upb.lp.edu.madonna.Ritmo;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Asignacion Ritmo</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link upb.lp.edu.madonna.impl.AsignacionRitmoImpl#getName <em>Name</em>}</li>
 *   <li>{@link upb.lp.edu.madonna.impl.AsignacionRitmoImpl#getVal <em>Val</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AsignacionRitmoImpl extends DeclaracionImpl implements AsignacionRitmo
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getVal() <em>Val</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVal()
   * @generated
   * @ordered
   */
  protected Ritmo val;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AsignacionRitmoImpl()
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
    return MadonnaPackage.Literals.ASIGNACION_RITMO;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MadonnaPackage.ASIGNACION_RITMO__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Ritmo getVal()
  {
    if (val != null && val.eIsProxy())
    {
      InternalEObject oldVal = (InternalEObject)val;
      val = (Ritmo)eResolveProxy(oldVal);
      if (val != oldVal)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MadonnaPackage.ASIGNACION_RITMO__VAL, oldVal, val));
      }
    }
    return val;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Ritmo basicGetVal()
  {
    return val;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setVal(Ritmo newVal)
  {
    Ritmo oldVal = val;
    val = newVal;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MadonnaPackage.ASIGNACION_RITMO__VAL, oldVal, val));
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
      case MadonnaPackage.ASIGNACION_RITMO__NAME:
        return getName();
      case MadonnaPackage.ASIGNACION_RITMO__VAL:
        if (resolve) return getVal();
        return basicGetVal();
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
      case MadonnaPackage.ASIGNACION_RITMO__NAME:
        setName((String)newValue);
        return;
      case MadonnaPackage.ASIGNACION_RITMO__VAL:
        setVal((Ritmo)newValue);
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
      case MadonnaPackage.ASIGNACION_RITMO__NAME:
        setName(NAME_EDEFAULT);
        return;
      case MadonnaPackage.ASIGNACION_RITMO__VAL:
        setVal((Ritmo)null);
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
      case MadonnaPackage.ASIGNACION_RITMO__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case MadonnaPackage.ASIGNACION_RITMO__VAL:
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
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //AsignacionRitmoImpl
