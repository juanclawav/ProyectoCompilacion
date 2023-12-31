/**
 * generated by Xtext 2.31.0
 */
package upb.lp.edu.madonna.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import upb.lp.edu.madonna.AsignacionSubNota;
import upb.lp.edu.madonna.MadonnaPackage;
import upb.lp.edu.madonna.SubNota;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Asignacion Sub Nota</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link upb.lp.edu.madonna.impl.AsignacionSubNotaImpl#getName <em>Name</em>}</li>
 *   <li>{@link upb.lp.edu.madonna.impl.AsignacionSubNotaImpl#getVal <em>Val</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AsignacionSubNotaImpl extends DeclaracionImpl implements AsignacionSubNota
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
  protected SubNota val;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AsignacionSubNotaImpl()
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
    return MadonnaPackage.Literals.ASIGNACION_SUB_NOTA;
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
      eNotify(new ENotificationImpl(this, Notification.SET, MadonnaPackage.ASIGNACION_SUB_NOTA__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SubNota getVal()
  {
    if (val != null && val.eIsProxy())
    {
      InternalEObject oldVal = (InternalEObject)val;
      val = (SubNota)eResolveProxy(oldVal);
      if (val != oldVal)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MadonnaPackage.ASIGNACION_SUB_NOTA__VAL, oldVal, val));
      }
    }
    return val;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SubNota basicGetVal()
  {
    return val;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setVal(SubNota newVal)
  {
    SubNota oldVal = val;
    val = newVal;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MadonnaPackage.ASIGNACION_SUB_NOTA__VAL, oldVal, val));
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
      case MadonnaPackage.ASIGNACION_SUB_NOTA__NAME:
        return getName();
      case MadonnaPackage.ASIGNACION_SUB_NOTA__VAL:
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
      case MadonnaPackage.ASIGNACION_SUB_NOTA__NAME:
        setName((String)newValue);
        return;
      case MadonnaPackage.ASIGNACION_SUB_NOTA__VAL:
        setVal((SubNota)newValue);
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
      case MadonnaPackage.ASIGNACION_SUB_NOTA__NAME:
        setName(NAME_EDEFAULT);
        return;
      case MadonnaPackage.ASIGNACION_SUB_NOTA__VAL:
        setVal((SubNota)null);
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
      case MadonnaPackage.ASIGNACION_SUB_NOTA__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case MadonnaPackage.ASIGNACION_SUB_NOTA__VAL:
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

} //AsignacionSubNotaImpl
