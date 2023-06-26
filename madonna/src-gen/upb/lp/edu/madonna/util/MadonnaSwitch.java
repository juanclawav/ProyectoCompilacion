/**
 * generated by Xtext 2.31.0
 */
package upb.lp.edu.madonna.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import upb.lp.edu.madonna.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see upb.lp.edu.madonna.MadonnaPackage
 * @generated
 */
public class MadonnaSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static MadonnaPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MadonnaSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = MadonnaPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case MadonnaPackage.PROGRAMA:
      {
        Programa programa = (Programa)theEObject;
        T result = casePrograma(programa);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MadonnaPackage.PRINT:
      {
        Print print = (Print)theEObject;
        T result = casePrint(print);
        if (result == null) result = caseDeclaracion(print);
        if (result == null) result = caseInstrucciones(print);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MadonnaPackage.INSTRUCCIONES:
      {
        Instrucciones instrucciones = (Instrucciones)theEObject;
        T result = caseInstrucciones(instrucciones);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MadonnaPackage.LLAVE:
      {
        Llave llave = (Llave)theEObject;
        T result = caseLlave(llave);
        if (result == null) result = caseExpresion(llave);
        if (result == null) result = caseValor(llave);
        if (result == null) result = caseInstrucciones(llave);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MadonnaPackage.LLAMADO_FUNC:
      {
        LlamadoFunc llamadoFunc = (LlamadoFunc)theEObject;
        T result = caseLlamadoFunc(llamadoFunc);
        if (result == null) result = caseExpresion(llamadoFunc);
        if (result == null) result = caseValor(llamadoFunc);
        if (result == null) result = caseInstrucciones(llamadoFunc);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MadonnaPackage.DECLARACION:
      {
        Declaracion declaracion = (Declaracion)theEObject;
        T result = caseDeclaracion(declaracion);
        if (result == null) result = caseInstrucciones(declaracion);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MadonnaPackage.FUNCION:
      {
        Funcion funcion = (Funcion)theEObject;
        T result = caseFuncion(funcion);
        if (result == null) result = caseDeclaracion(funcion);
        if (result == null) result = caseInstrucciones(funcion);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MadonnaPackage.ASIGNACION_NOTA:
      {
        AsignacionNota asignacionNota = (AsignacionNota)theEObject;
        T result = caseAsignacionNota(asignacionNota);
        if (result == null) result = caseDeclaracion(asignacionNota);
        if (result == null) result = caseInstrucciones(asignacionNota);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MadonnaPackage.ASIGNACION_MELODIA:
      {
        AsignacionMelodia asignacionMelodia = (AsignacionMelodia)theEObject;
        T result = caseAsignacionMelodia(asignacionMelodia);
        if (result == null) result = caseDeclaracion(asignacionMelodia);
        if (result == null) result = caseInstrucciones(asignacionMelodia);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MadonnaPackage.ASIGNACION_SUB_NOTA:
      {
        AsignacionSubNota asignacionSubNota = (AsignacionSubNota)theEObject;
        T result = caseAsignacionSubNota(asignacionSubNota);
        if (result == null) result = caseDeclaracion(asignacionSubNota);
        if (result == null) result = caseInstrucciones(asignacionSubNota);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MadonnaPackage.ASIGNACION_RITMO:
      {
        AsignacionRitmo asignacionRitmo = (AsignacionRitmo)theEObject;
        T result = caseAsignacionRitmo(asignacionRitmo);
        if (result == null) result = caseDeclaracion(asignacionRitmo);
        if (result == null) result = caseInstrucciones(asignacionRitmo);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MadonnaPackage.PARAM:
      {
        Param param = (Param)theEObject;
        T result = caseParam(param);
        if (result == null) result = caseDeclaracion(param);
        if (result == null) result = caseInstrucciones(param);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MadonnaPackage.CONSTANTE:
      {
        Constante constante = (Constante)theEObject;
        T result = caseConstante(constante);
        if (result == null) result = caseExpresion(constante);
        if (result == null) result = caseValor(constante);
        if (result == null) result = caseInstrucciones(constante);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MadonnaPackage.VALOR:
      {
        Valor valor = (Valor)theEObject;
        T result = caseValor(valor);
        if (result == null) result = caseInstrucciones(valor);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MadonnaPackage.EXPRESION:
      {
        Expresion expresion = (Expresion)theEObject;
        T result = caseExpresion(expresion);
        if (result == null) result = caseValor(expresion);
        if (result == null) result = caseInstrucciones(expresion);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MadonnaPackage.EXPR_CONCATENACION:
      {
        ExprConcatenacion exprConcatenacion = (ExprConcatenacion)theEObject;
        T result = caseExprConcatenacion(exprConcatenacion);
        if (result == null) result = caseExpresion(exprConcatenacion);
        if (result == null) result = caseValor(exprConcatenacion);
        if (result == null) result = caseInstrucciones(exprConcatenacion);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MadonnaPackage.EXPR_ARITMETICA:
      {
        ExprAritmetica exprAritmetica = (ExprAritmetica)theEObject;
        T result = caseExprAritmetica(exprAritmetica);
        if (result == null) result = caseExpresion(exprAritmetica);
        if (result == null) result = caseValor(exprAritmetica);
        if (result == null) result = caseInstrucciones(exprAritmetica);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MadonnaPackage.EXPR_LOGICA:
      {
        ExprLogica exprLogica = (ExprLogica)theEObject;
        T result = caseExprLogica(exprLogica);
        if (result == null) result = caseExpresion(exprLogica);
        if (result == null) result = caseValor(exprLogica);
        if (result == null) result = caseInstrucciones(exprLogica);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MadonnaPackage.EXPR_LOGICA_OPERADORES:
      {
        ExprLogicaOperadores exprLogicaOperadores = (ExprLogicaOperadores)theEObject;
        T result = caseExprLogicaOperadores(exprLogicaOperadores);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MadonnaPackage.EXPR_COMPARACION:
      {
        ExprComparacion exprComparacion = (ExprComparacion)theEObject;
        T result = caseExprComparacion(exprComparacion);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MadonnaPackage.PRIMITIVO:
      {
        Primitivo primitivo = (Primitivo)theEObject;
        T result = casePrimitivo(primitivo);
        if (result == null) result = caseParam(primitivo);
        if (result == null) result = caseDeclaracion(primitivo);
        if (result == null) result = caseInstrucciones(primitivo);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MadonnaPackage.NOTA:
      {
        Nota nota = (Nota)theEObject;
        T result = caseNota(nota);
        if (result == null) result = caseExprAritmetica(nota);
        if (result == null) result = caseExpresion(nota);
        if (result == null) result = caseValor(nota);
        if (result == null) result = caseInstrucciones(nota);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MadonnaPackage.MELODIA:
      {
        Melodia melodia = (Melodia)theEObject;
        T result = caseMelodia(melodia);
        if (result == null) result = caseExprConcatenacion(melodia);
        if (result == null) result = caseExpresion(melodia);
        if (result == null) result = caseValor(melodia);
        if (result == null) result = caseInstrucciones(melodia);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MadonnaPackage.SUB_NOTA:
      {
        SubNota subNota = (SubNota)theEObject;
        T result = caseSubNota(subNota);
        if (result == null) result = caseExprAritmetica(subNota);
        if (result == null) result = caseExpresion(subNota);
        if (result == null) result = caseValor(subNota);
        if (result == null) result = caseInstrucciones(subNota);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MadonnaPackage.RITMO:
      {
        Ritmo ritmo = (Ritmo)theEObject;
        T result = caseRitmo(ritmo);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Programa</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Programa</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePrograma(Programa object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Print</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Print</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePrint(Print object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Instrucciones</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Instrucciones</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInstrucciones(Instrucciones object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Llave</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Llave</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLlave(Llave object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Llamado Func</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Llamado Func</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLlamadoFunc(LlamadoFunc object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Declaracion</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Declaracion</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDeclaracion(Declaracion object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Funcion</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Funcion</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFuncion(Funcion object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Asignacion Nota</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Asignacion Nota</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAsignacionNota(AsignacionNota object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Asignacion Melodia</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Asignacion Melodia</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAsignacionMelodia(AsignacionMelodia object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Asignacion Sub Nota</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Asignacion Sub Nota</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAsignacionSubNota(AsignacionSubNota object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Asignacion Ritmo</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Asignacion Ritmo</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAsignacionRitmo(AsignacionRitmo object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Param</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Param</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParam(Param object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Constante</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Constante</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConstante(Constante object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Valor</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Valor</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseValor(Valor object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expresion</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expresion</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExpresion(Expresion object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expr Concatenacion</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expr Concatenacion</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExprConcatenacion(ExprConcatenacion object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expr Aritmetica</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expr Aritmetica</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExprAritmetica(ExprAritmetica object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expr Logica</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expr Logica</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExprLogica(ExprLogica object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expr Logica Operadores</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expr Logica Operadores</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExprLogicaOperadores(ExprLogicaOperadores object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expr Comparacion</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expr Comparacion</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExprComparacion(ExprComparacion object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Primitivo</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Primitivo</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePrimitivo(Primitivo object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Nota</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Nota</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNota(Nota object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Melodia</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Melodia</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMelodia(Melodia object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Sub Nota</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Sub Nota</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSubNota(SubNota object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ritmo</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ritmo</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRitmo(Ritmo object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //MadonnaSwitch
