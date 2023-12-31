/**
 * generated by Xtext 2.31.0
 */
package upb.lp.edu.madonna.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import upb.lp.edu.madonna.AsignacionMelodia;
import upb.lp.edu.madonna.AsignacionNota;
import upb.lp.edu.madonna.AsignacionRitmo;
import upb.lp.edu.madonna.AsignacionSubNota;
import upb.lp.edu.madonna.Constante;
import upb.lp.edu.madonna.Declaracion;
import upb.lp.edu.madonna.ExprAritmetica;
import upb.lp.edu.madonna.ExprComparacion;
import upb.lp.edu.madonna.ExprConcatenacion;
import upb.lp.edu.madonna.ExprLogica;
import upb.lp.edu.madonna.ExprLogicaOperadores;
import upb.lp.edu.madonna.Expresion;
import upb.lp.edu.madonna.Funcion;
import upb.lp.edu.madonna.Instrucciones;
import upb.lp.edu.madonna.LlamadoFunc;
import upb.lp.edu.madonna.Llave;
import upb.lp.edu.madonna.MadonnaFactory;
import upb.lp.edu.madonna.MadonnaPackage;
import upb.lp.edu.madonna.Melodia;
import upb.lp.edu.madonna.Nota;
import upb.lp.edu.madonna.Param;
import upb.lp.edu.madonna.Primitivo;
import upb.lp.edu.madonna.Print;
import upb.lp.edu.madonna.Programa;
import upb.lp.edu.madonna.Ritmo;
import upb.lp.edu.madonna.SubNota;
import upb.lp.edu.madonna.Valor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MadonnaPackageImpl extends EPackageImpl implements MadonnaPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass programaEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass printEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass instruccionesEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass llaveEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass llamadoFuncEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass declaracionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass funcionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass asignacionNotaEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass asignacionMelodiaEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass asignacionSubNotaEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass asignacionRitmoEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass paramEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass constanteEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass valorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass expresionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass exprConcatenacionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass exprAritmeticaEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass exprLogicaEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass exprLogicaOperadoresEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass exprComparacionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass primitivoEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass notaEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass melodiaEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass subNotaEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ritmoEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see upb.lp.edu.madonna.MadonnaPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private MadonnaPackageImpl()
  {
    super(eNS_URI, MadonnaFactory.eINSTANCE);
  }
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   *
   * <p>This method is used to initialize {@link MadonnaPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static MadonnaPackage init()
  {
    if (isInited) return (MadonnaPackage)EPackage.Registry.INSTANCE.getEPackage(MadonnaPackage.eNS_URI);

    // Obtain or create and register package
    Object registeredMadonnaPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
    MadonnaPackageImpl theMadonnaPackage = registeredMadonnaPackage instanceof MadonnaPackageImpl ? (MadonnaPackageImpl)registeredMadonnaPackage : new MadonnaPackageImpl();

    isInited = true;

    // Create package meta-data objects
    theMadonnaPackage.createPackageContents();

    // Initialize created meta-data
    theMadonnaPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theMadonnaPackage.freeze();

    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(MadonnaPackage.eNS_URI, theMadonnaPackage);
    return theMadonnaPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getPrograma()
  {
    return programaEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getPrograma_Name()
  {
    return (EAttribute)programaEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getPrograma_Prog()
  {
    return (EReference)programaEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getPrint()
  {
    return printEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getPrint_PrintTipo()
  {
    return (EAttribute)printEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getPrint_Val()
  {
    return (EReference)printEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getInstrucciones()
  {
    return instruccionesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getLlave()
  {
    return llaveEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getLlave_ExprLogCondicion()
  {
    return (EReference)llaveEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getLlave_AcordeRes()
  {
    return (EReference)llaveEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getLlave_Rep()
  {
    return (EReference)llaveEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getLlamadoFunc()
  {
    return llamadoFuncEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getLlamadoFunc_FuncionID()
  {
    return (EReference)llamadoFuncEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getLlamadoFunc_Args()
  {
    return (EReference)llamadoFuncEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getDeclaracion()
  {
    return declaracionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getFuncion()
  {
    return funcionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getFuncion_Name()
  {
    return (EAttribute)funcionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getFuncion_Param()
  {
    return (EReference)funcionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getFuncion_Declar()
  {
    return (EReference)funcionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getFuncion_Val()
  {
    return (EReference)funcionEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getAsignacionNota()
  {
    return asignacionNotaEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getAsignacionNota_Name()
  {
    return (EAttribute)asignacionNotaEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getAsignacionNota_Val()
  {
    return (EReference)asignacionNotaEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getAsignacionMelodia()
  {
    return asignacionMelodiaEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getAsignacionMelodia_Name()
  {
    return (EAttribute)asignacionMelodiaEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getAsignacionMelodia_Val()
  {
    return (EReference)asignacionMelodiaEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getAsignacionSubNota()
  {
    return asignacionSubNotaEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getAsignacionSubNota_Name()
  {
    return (EAttribute)asignacionSubNotaEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getAsignacionSubNota_Val()
  {
    return (EReference)asignacionSubNotaEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getAsignacionRitmo()
  {
    return asignacionRitmoEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getAsignacionRitmo_Name()
  {
    return (EAttribute)asignacionRitmoEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getAsignacionRitmo_Val()
  {
    return (EReference)asignacionRitmoEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getParam()
  {
    return paramEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getConstante()
  {
    return constanteEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getConstante_Nombre()
  {
    return (EReference)constanteEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getValor()
  {
    return valorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getExpresion()
  {
    return expresionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getExprConcatenacion()
  {
    return exprConcatenacionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getExprConcatenacion_OperadorCon()
  {
    return (EAttribute)exprConcatenacionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getExprConcatenacion_ExprCon()
  {
    return (EReference)exprConcatenacionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getExprAritmetica()
  {
    return exprAritmeticaEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getExprAritmetica_OperadorAr()
  {
    return (EAttribute)exprAritmeticaEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getExprAritmetica_ExprAr()
  {
    return (EReference)exprAritmeticaEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getExprLogica()
  {
    return exprLogicaEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getExprLogica_Negado()
  {
    return (EAttribute)exprLogicaEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getExprLogica_ExprLog()
  {
    return (EReference)exprLogicaEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getExprLogicaOperadores()
  {
    return exprLogicaOperadoresEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getExprLogicaOperadores_OperadorLog()
  {
    return (EAttribute)exprLogicaOperadoresEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getExprLogicaOperadores_ExprLogs()
  {
    return (EReference)exprLogicaOperadoresEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getExprComparacion()
  {
    return exprComparacionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getExprComparacion_OperadorComp()
  {
    return (EAttribute)exprComparacionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getExprComparacion_ExprComIzq()
  {
    return (EReference)exprComparacionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getExprComparacion_ExprComDer()
  {
    return (EReference)exprComparacionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getPrimitivo()
  {
    return primitivoEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getPrimitivo_Name()
  {
    return (EAttribute)primitivoEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getPrimitivo_Tipo()
  {
    return (EAttribute)primitivoEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getNota()
  {
    return notaEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getNota_X()
  {
    return (EAttribute)notaEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getMelodia()
  {
    return melodiaEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getMelodia_X()
  {
    return (EAttribute)melodiaEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getSubNota()
  {
    return subNotaEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getSubNota_X()
  {
    return (EAttribute)subNotaEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getRitmo()
  {
    return ritmoEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getRitmo_X()
  {
    return (EAttribute)ritmoEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public MadonnaFactory getMadonnaFactory()
  {
    return (MadonnaFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    programaEClass = createEClass(PROGRAMA);
    createEAttribute(programaEClass, PROGRAMA__NAME);
    createEReference(programaEClass, PROGRAMA__PROG);

    printEClass = createEClass(PRINT);
    createEAttribute(printEClass, PRINT__PRINT_TIPO);
    createEReference(printEClass, PRINT__VAL);

    instruccionesEClass = createEClass(INSTRUCCIONES);

    llaveEClass = createEClass(LLAVE);
    createEReference(llaveEClass, LLAVE__EXPR_LOG_CONDICION);
    createEReference(llaveEClass, LLAVE__ACORDE_RES);
    createEReference(llaveEClass, LLAVE__REP);

    llamadoFuncEClass = createEClass(LLAMADO_FUNC);
    createEReference(llamadoFuncEClass, LLAMADO_FUNC__FUNCION_ID);
    createEReference(llamadoFuncEClass, LLAMADO_FUNC__ARGS);

    declaracionEClass = createEClass(DECLARACION);

    funcionEClass = createEClass(FUNCION);
    createEAttribute(funcionEClass, FUNCION__NAME);
    createEReference(funcionEClass, FUNCION__PARAM);
    createEReference(funcionEClass, FUNCION__DECLAR);
    createEReference(funcionEClass, FUNCION__VAL);

    asignacionNotaEClass = createEClass(ASIGNACION_NOTA);
    createEAttribute(asignacionNotaEClass, ASIGNACION_NOTA__NAME);
    createEReference(asignacionNotaEClass, ASIGNACION_NOTA__VAL);

    asignacionMelodiaEClass = createEClass(ASIGNACION_MELODIA);
    createEAttribute(asignacionMelodiaEClass, ASIGNACION_MELODIA__NAME);
    createEReference(asignacionMelodiaEClass, ASIGNACION_MELODIA__VAL);

    asignacionSubNotaEClass = createEClass(ASIGNACION_SUB_NOTA);
    createEAttribute(asignacionSubNotaEClass, ASIGNACION_SUB_NOTA__NAME);
    createEReference(asignacionSubNotaEClass, ASIGNACION_SUB_NOTA__VAL);

    asignacionRitmoEClass = createEClass(ASIGNACION_RITMO);
    createEAttribute(asignacionRitmoEClass, ASIGNACION_RITMO__NAME);
    createEReference(asignacionRitmoEClass, ASIGNACION_RITMO__VAL);

    paramEClass = createEClass(PARAM);

    constanteEClass = createEClass(CONSTANTE);
    createEReference(constanteEClass, CONSTANTE__NOMBRE);

    valorEClass = createEClass(VALOR);

    expresionEClass = createEClass(EXPRESION);

    exprConcatenacionEClass = createEClass(EXPR_CONCATENACION);
    createEAttribute(exprConcatenacionEClass, EXPR_CONCATENACION__OPERADOR_CON);
    createEReference(exprConcatenacionEClass, EXPR_CONCATENACION__EXPR_CON);

    exprAritmeticaEClass = createEClass(EXPR_ARITMETICA);
    createEAttribute(exprAritmeticaEClass, EXPR_ARITMETICA__OPERADOR_AR);
    createEReference(exprAritmeticaEClass, EXPR_ARITMETICA__EXPR_AR);

    exprLogicaEClass = createEClass(EXPR_LOGICA);
    createEAttribute(exprLogicaEClass, EXPR_LOGICA__NEGADO);
    createEReference(exprLogicaEClass, EXPR_LOGICA__EXPR_LOG);

    exprLogicaOperadoresEClass = createEClass(EXPR_LOGICA_OPERADORES);
    createEAttribute(exprLogicaOperadoresEClass, EXPR_LOGICA_OPERADORES__OPERADOR_LOG);
    createEReference(exprLogicaOperadoresEClass, EXPR_LOGICA_OPERADORES__EXPR_LOGS);

    exprComparacionEClass = createEClass(EXPR_COMPARACION);
    createEAttribute(exprComparacionEClass, EXPR_COMPARACION__OPERADOR_COMP);
    createEReference(exprComparacionEClass, EXPR_COMPARACION__EXPR_COM_IZQ);
    createEReference(exprComparacionEClass, EXPR_COMPARACION__EXPR_COM_DER);

    primitivoEClass = createEClass(PRIMITIVO);
    createEAttribute(primitivoEClass, PRIMITIVO__NAME);
    createEAttribute(primitivoEClass, PRIMITIVO__TIPO);

    notaEClass = createEClass(NOTA);
    createEAttribute(notaEClass, NOTA__X);

    melodiaEClass = createEClass(MELODIA);
    createEAttribute(melodiaEClass, MELODIA__X);

    subNotaEClass = createEClass(SUB_NOTA);
    createEAttribute(subNotaEClass, SUB_NOTA__X);

    ritmoEClass = createEClass(RITMO);
    createEAttribute(ritmoEClass, RITMO__X);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    printEClass.getESuperTypes().add(this.getDeclaracion());
    llaveEClass.getESuperTypes().add(this.getExpresion());
    llamadoFuncEClass.getESuperTypes().add(this.getExpresion());
    declaracionEClass.getESuperTypes().add(this.getInstrucciones());
    funcionEClass.getESuperTypes().add(this.getDeclaracion());
    asignacionNotaEClass.getESuperTypes().add(this.getDeclaracion());
    asignacionMelodiaEClass.getESuperTypes().add(this.getDeclaracion());
    asignacionSubNotaEClass.getESuperTypes().add(this.getDeclaracion());
    asignacionRitmoEClass.getESuperTypes().add(this.getDeclaracion());
    paramEClass.getESuperTypes().add(this.getDeclaracion());
    constanteEClass.getESuperTypes().add(this.getExpresion());
    valorEClass.getESuperTypes().add(this.getInstrucciones());
    expresionEClass.getESuperTypes().add(this.getValor());
    exprConcatenacionEClass.getESuperTypes().add(this.getExpresion());
    exprAritmeticaEClass.getESuperTypes().add(this.getExpresion());
    exprLogicaEClass.getESuperTypes().add(this.getExpresion());
    primitivoEClass.getESuperTypes().add(this.getParam());
    notaEClass.getESuperTypes().add(this.getExprAritmetica());
    melodiaEClass.getESuperTypes().add(this.getExprConcatenacion());
    subNotaEClass.getESuperTypes().add(this.getExprAritmetica());

    // Initialize classes and features; add operations and parameters
    initEClass(programaEClass, Programa.class, "Programa", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPrograma_Name(), ecorePackage.getEString(), "name", null, 0, 1, Programa.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPrograma_Prog(), this.getInstrucciones(), null, "prog", null, 0, -1, Programa.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(printEClass, Print.class, "Print", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPrint_PrintTipo(), ecorePackage.getEString(), "printTipo", null, 0, 1, Print.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPrint_Val(), this.getValor(), null, "val", null, 0, 1, Print.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(instruccionesEClass, Instrucciones.class, "Instrucciones", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(llaveEClass, Llave.class, "Llave", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getLlave_ExprLogCondicion(), this.getExpresion(), null, "exprLogCondicion", null, 0, 1, Llave.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLlave_AcordeRes(), this.getExpresion(), null, "acordeRes", null, 0, 1, Llave.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLlave_Rep(), this.getExpresion(), null, "Rep", null, 0, 1, Llave.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(llamadoFuncEClass, LlamadoFunc.class, "LlamadoFunc", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getLlamadoFunc_FuncionID(), this.getDeclaracion(), null, "funcionID", null, 0, 1, LlamadoFunc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLlamadoFunc_Args(), this.getValor(), null, "args", null, 0, -1, LlamadoFunc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(declaracionEClass, Declaracion.class, "Declaracion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(funcionEClass, Funcion.class, "Funcion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFuncion_Name(), ecorePackage.getEString(), "name", null, 0, 1, Funcion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFuncion_Param(), this.getParam(), null, "param", null, 0, -1, Funcion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFuncion_Declar(), this.getDeclaracion(), null, "declar", null, 0, -1, Funcion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFuncion_Val(), this.getValor(), null, "val", null, 0, 1, Funcion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(asignacionNotaEClass, AsignacionNota.class, "AsignacionNota", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAsignacionNota_Name(), ecorePackage.getEString(), "name", null, 0, 1, AsignacionNota.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAsignacionNota_Val(), this.getNota(), null, "val", null, 0, 1, AsignacionNota.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(asignacionMelodiaEClass, AsignacionMelodia.class, "AsignacionMelodia", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAsignacionMelodia_Name(), ecorePackage.getEString(), "name", null, 0, 1, AsignacionMelodia.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAsignacionMelodia_Val(), this.getMelodia(), null, "val", null, 0, 1, AsignacionMelodia.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(asignacionSubNotaEClass, AsignacionSubNota.class, "AsignacionSubNota", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAsignacionSubNota_Name(), ecorePackage.getEString(), "name", null, 0, 1, AsignacionSubNota.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAsignacionSubNota_Val(), this.getSubNota(), null, "val", null, 0, 1, AsignacionSubNota.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(asignacionRitmoEClass, AsignacionRitmo.class, "AsignacionRitmo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAsignacionRitmo_Name(), ecorePackage.getEString(), "name", null, 0, 1, AsignacionRitmo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAsignacionRitmo_Val(), this.getRitmo(), null, "val", null, 0, 1, AsignacionRitmo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(paramEClass, Param.class, "Param", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(constanteEClass, Constante.class, "Constante", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getConstante_Nombre(), this.getDeclaracion(), null, "nombre", null, 0, 1, Constante.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(valorEClass, Valor.class, "Valor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(expresionEClass, Expresion.class, "Expresion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(exprConcatenacionEClass, ExprConcatenacion.class, "ExprConcatenacion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getExprConcatenacion_OperadorCon(), ecorePackage.getEString(), "operadorCon", null, 0, 1, ExprConcatenacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExprConcatenacion_ExprCon(), this.getExpresion(), null, "exprCon", null, 0, -1, ExprConcatenacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(exprAritmeticaEClass, ExprAritmetica.class, "ExprAritmetica", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getExprAritmetica_OperadorAr(), ecorePackage.getEString(), "operadorAr", null, 0, 1, ExprAritmetica.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExprAritmetica_ExprAr(), this.getExpresion(), null, "exprAr", null, 0, -1, ExprAritmetica.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(exprLogicaEClass, ExprLogica.class, "ExprLogica", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getExprLogica_Negado(), ecorePackage.getEBoolean(), "Negado", null, 0, 1, ExprLogica.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExprLogica_ExprLog(), ecorePackage.getEObject(), null, "exprLog", null, 0, 1, ExprLogica.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(exprLogicaOperadoresEClass, ExprLogicaOperadores.class, "ExprLogicaOperadores", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getExprLogicaOperadores_OperadorLog(), ecorePackage.getEString(), "operadorLog", null, 0, 1, ExprLogicaOperadores.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExprLogicaOperadores_ExprLogs(), this.getExpresion(), null, "exprLogs", null, 0, -1, ExprLogicaOperadores.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(exprComparacionEClass, ExprComparacion.class, "ExprComparacion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getExprComparacion_OperadorComp(), ecorePackage.getEString(), "operadorComp", null, 0, 1, ExprComparacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExprComparacion_ExprComIzq(), this.getExpresion(), null, "exprComIzq", null, 0, 1, ExprComparacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExprComparacion_ExprComDer(), this.getExpresion(), null, "exprComDer", null, 0, 1, ExprComparacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(primitivoEClass, Primitivo.class, "Primitivo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPrimitivo_Name(), ecorePackage.getEString(), "name", null, 0, 1, Primitivo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPrimitivo_Tipo(), ecorePackage.getEString(), "tipo", null, 0, 1, Primitivo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(notaEClass, Nota.class, "Nota", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getNota_X(), ecorePackage.getEInt(), "x", null, 0, 1, Nota.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(melodiaEClass, Melodia.class, "Melodia", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMelodia_X(), ecorePackage.getEString(), "x", null, 0, 1, Melodia.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(subNotaEClass, SubNota.class, "SubNota", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSubNota_X(), ecorePackage.getEDouble(), "x", null, 0, 1, SubNota.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ritmoEClass, Ritmo.class, "Ritmo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRitmo_X(), ecorePackage.getEString(), "x", null, 0, 1, Ritmo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //MadonnaPackageImpl
