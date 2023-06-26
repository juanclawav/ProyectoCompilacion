/*
 * generated by Xtext 2.31.0
 */
package upb.lp.edu.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import upb.lp.edu.madonna.AsignacionMelodia;
import upb.lp.edu.madonna.AsignacionNota;
import upb.lp.edu.madonna.AsignacionRitmo;
import upb.lp.edu.madonna.AsignacionSubNota;
import upb.lp.edu.madonna.Constante;
import upb.lp.edu.madonna.ExprAritmetica;
import upb.lp.edu.madonna.ExprComparacion;
import upb.lp.edu.madonna.ExprConcatenacion;
import upb.lp.edu.madonna.ExprLogica;
import upb.lp.edu.madonna.ExprLogicaOperadores;
import upb.lp.edu.madonna.Funcion;
import upb.lp.edu.madonna.LlamadoFunc;
import upb.lp.edu.madonna.Llave;
import upb.lp.edu.madonna.MadonnaPackage;
import upb.lp.edu.madonna.Melodia;
import upb.lp.edu.madonna.Nota;
import upb.lp.edu.madonna.Primitivo;
import upb.lp.edu.madonna.Print;
import upb.lp.edu.madonna.Programa;
import upb.lp.edu.madonna.Ritmo;
import upb.lp.edu.madonna.SubNota;
import upb.lp.edu.services.MadonnaGrammarAccess;

@SuppressWarnings("all")
public class MadonnaSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private MadonnaGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == MadonnaPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case MadonnaPackage.ASIGNACION_MELODIA:
				sequence_AsignacionMelodia(context, (AsignacionMelodia) semanticObject); 
				return; 
			case MadonnaPackage.ASIGNACION_NOTA:
				sequence_AsignacionNota(context, (AsignacionNota) semanticObject); 
				return; 
			case MadonnaPackage.ASIGNACION_RITMO:
				sequence_AsignacionRitmo(context, (AsignacionRitmo) semanticObject); 
				return; 
			case MadonnaPackage.ASIGNACION_SUB_NOTA:
				sequence_AsignacionSubNota(context, (AsignacionSubNota) semanticObject); 
				return; 
			case MadonnaPackage.CONSTANTE:
				sequence_Constante(context, (Constante) semanticObject); 
				return; 
			case MadonnaPackage.EXPR_ARITMETICA:
				sequence_ExprAritmetica(context, (ExprAritmetica) semanticObject); 
				return; 
			case MadonnaPackage.EXPR_COMPARACION:
				sequence_ExprComparacion(context, (ExprComparacion) semanticObject); 
				return; 
			case MadonnaPackage.EXPR_CONCATENACION:
				sequence_ExprConcatenacion(context, (ExprConcatenacion) semanticObject); 
				return; 
			case MadonnaPackage.EXPR_LOGICA:
				sequence_ExprLogica(context, (ExprLogica) semanticObject); 
				return; 
			case MadonnaPackage.EXPR_LOGICA_OPERADORES:
				sequence_ExprLogicaOperadores(context, (ExprLogicaOperadores) semanticObject); 
				return; 
			case MadonnaPackage.FUNCION:
				sequence_Funcion(context, (Funcion) semanticObject); 
				return; 
			case MadonnaPackage.LLAMADO_FUNC:
				sequence_LlamadoFunc(context, (LlamadoFunc) semanticObject); 
				return; 
			case MadonnaPackage.LLAVE:
				sequence_Llave(context, (Llave) semanticObject); 
				return; 
			case MadonnaPackage.MELODIA:
				sequence_Melodia(context, (Melodia) semanticObject); 
				return; 
			case MadonnaPackage.NOTA:
				sequence_Nota(context, (Nota) semanticObject); 
				return; 
			case MadonnaPackage.PRIMITIVO:
				if (rule == grammarAccess.getInstruccionesRule()
						|| rule == grammarAccess.getDeclaracionRule()
						|| rule == grammarAccess.getParamRule()) {
					sequence_Param_Primitivo(context, (Primitivo) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getPrimitivoRule()) {
					sequence_Primitivo(context, (Primitivo) semanticObject); 
					return; 
				}
				else break;
			case MadonnaPackage.PRINT:
				sequence_Print(context, (Print) semanticObject); 
				return; 
			case MadonnaPackage.PROGRAMA:
				sequence_Programa(context, (Programa) semanticObject); 
				return; 
			case MadonnaPackage.RITMO:
				sequence_Ritmo(context, (Ritmo) semanticObject); 
				return; 
			case MadonnaPackage.SUB_NOTA:
				sequence_SubNota(context, (SubNota) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * <pre>
	 * Contexts:
	 *     Instrucciones returns AsignacionMelodia
	 *     Declaracion returns AsignacionMelodia
	 *     AsignacionMelodia returns AsignacionMelodia
	 *
	 * Constraint:
	 *     (name=ID val=[Melodia|ID])
	 * </pre>
	 */
	protected void sequence_AsignacionMelodia(ISerializationContext context, AsignacionMelodia semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MadonnaPackage.Literals.ASIGNACION_MELODIA__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MadonnaPackage.Literals.ASIGNACION_MELODIA__NAME));
			if (transientValues.isValueTransient(semanticObject, MadonnaPackage.Literals.ASIGNACION_MELODIA__VAL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MadonnaPackage.Literals.ASIGNACION_MELODIA__VAL));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAsignacionMelodiaAccess().getNameIDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getAsignacionMelodiaAccess().getValMelodiaIDTerminalRuleCall_1_0_1(), semanticObject.eGet(MadonnaPackage.Literals.ASIGNACION_MELODIA__VAL, false));
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Instrucciones returns AsignacionNota
	 *     Declaracion returns AsignacionNota
	 *     AsignacionNota returns AsignacionNota
	 *
	 * Constraint:
	 *     (name=ID val=[Nota|ID])
	 * </pre>
	 */
	protected void sequence_AsignacionNota(ISerializationContext context, AsignacionNota semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MadonnaPackage.Literals.ASIGNACION_NOTA__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MadonnaPackage.Literals.ASIGNACION_NOTA__NAME));
			if (transientValues.isValueTransient(semanticObject, MadonnaPackage.Literals.ASIGNACION_NOTA__VAL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MadonnaPackage.Literals.ASIGNACION_NOTA__VAL));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAsignacionNotaAccess().getNameIDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getAsignacionNotaAccess().getValNotaIDTerminalRuleCall_1_0_1(), semanticObject.eGet(MadonnaPackage.Literals.ASIGNACION_NOTA__VAL, false));
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Instrucciones returns AsignacionRitmo
	 *     Declaracion returns AsignacionRitmo
	 *     AsignacionRitmo returns AsignacionRitmo
	 *
	 * Constraint:
	 *     (name=ID val=[Ritmo|ID])
	 * </pre>
	 */
	protected void sequence_AsignacionRitmo(ISerializationContext context, AsignacionRitmo semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MadonnaPackage.Literals.ASIGNACION_RITMO__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MadonnaPackage.Literals.ASIGNACION_RITMO__NAME));
			if (transientValues.isValueTransient(semanticObject, MadonnaPackage.Literals.ASIGNACION_RITMO__VAL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MadonnaPackage.Literals.ASIGNACION_RITMO__VAL));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAsignacionRitmoAccess().getNameIDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getAsignacionRitmoAccess().getValRitmoIDTerminalRuleCall_1_0_1(), semanticObject.eGet(MadonnaPackage.Literals.ASIGNACION_RITMO__VAL, false));
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Instrucciones returns AsignacionSubNota
	 *     Declaracion returns AsignacionSubNota
	 *     AsignacionSubNota returns AsignacionSubNota
	 *
	 * Constraint:
	 *     (name=ID val=[SubNota|ID])
	 * </pre>
	 */
	protected void sequence_AsignacionSubNota(ISerializationContext context, AsignacionSubNota semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MadonnaPackage.Literals.ASIGNACION_SUB_NOTA__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MadonnaPackage.Literals.ASIGNACION_SUB_NOTA__NAME));
			if (transientValues.isValueTransient(semanticObject, MadonnaPackage.Literals.ASIGNACION_SUB_NOTA__VAL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MadonnaPackage.Literals.ASIGNACION_SUB_NOTA__VAL));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAsignacionSubNotaAccess().getNameIDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getAsignacionSubNotaAccess().getValSubNotaIDTerminalRuleCall_1_0_1(), semanticObject.eGet(MadonnaPackage.Literals.ASIGNACION_SUB_NOTA__VAL, false));
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Instrucciones returns Constante
	 *     Constante returns Constante
	 *     Valor returns Constante
	 *     Expresion returns Constante
	 *
	 * Constraint:
	 *     nombre=[Declaracion|ID]
	 * </pre>
	 */
	protected void sequence_Constante(ISerializationContext context, Constante semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MadonnaPackage.Literals.CONSTANTE__NOMBRE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MadonnaPackage.Literals.CONSTANTE__NOMBRE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getConstanteAccess().getNombreDeclaracionIDTerminalRuleCall_0_1(), semanticObject.eGet(MadonnaPackage.Literals.CONSTANTE__NOMBRE, false));
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Instrucciones returns ExprAritmetica
	 *     Valor returns ExprAritmetica
	 *     Expresion returns ExprAritmetica
	 *     ExprAritmetica returns ExprAritmetica
	 *
	 * Constraint:
	 *     ((operadorAr='+' | operadorAr='-' | operadorAr='/' | operadorAr='*' | operadorAr='%') exprAr+=Expresion+)
	 * </pre>
	 */
	protected void sequence_ExprAritmetica(ISerializationContext context, ExprAritmetica semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     ExprComparacion returns ExprComparacion
	 *
	 * Constraint:
	 *     (
	 *         (
	 *             operadorComp='&lt;' | 
	 *             operadorComp='&gt;' | 
	 *             operadorComp='&lt;=' | 
	 *             operadorComp='&gt;=' | 
	 *             operadorComp='==' | 
	 *             operadorComp='~='
	 *         ) 
	 *         exprComIzq=Expresion 
	 *         exprComDer=Expresion
	 *     )
	 * </pre>
	 */
	protected void sequence_ExprComparacion(ISerializationContext context, ExprComparacion semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Instrucciones returns ExprConcatenacion
	 *     Valor returns ExprConcatenacion
	 *     Expresion returns ExprConcatenacion
	 *     ExprConcatenacion returns ExprConcatenacion
	 *
	 * Constraint:
	 *     (operadorCon='++' exprCon+=Expresion+)
	 * </pre>
	 */
	protected void sequence_ExprConcatenacion(ISerializationContext context, ExprConcatenacion semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     ExprLogicaOperadores returns ExprLogicaOperadores
	 *
	 * Constraint:
	 *     ((operadorLog='&&' | operadorLog='||') exprLogs+=Expresion+)
	 * </pre>
	 */
	protected void sequence_ExprLogicaOperadores(ISerializationContext context, ExprLogicaOperadores semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Instrucciones returns ExprLogica
	 *     Valor returns ExprLogica
	 *     Expresion returns ExprLogica
	 *     ExprLogica returns ExprLogica
	 *
	 * Constraint:
	 *     (Negado?='!'? (exprLog=ExprLogicaOperadores | exprLog=Ritmo | exprLog=ExprComparacion))
	 * </pre>
	 */
	protected void sequence_ExprLogica(ISerializationContext context, ExprLogica semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Instrucciones returns Funcion
	 *     Declaracion returns Funcion
	 *     Funcion returns Funcion
	 *
	 * Constraint:
	 *     (name=ID param+=Param? declar+=Declaracion* val=Valor)
	 * </pre>
	 */
	protected void sequence_Funcion(ISerializationContext context, Funcion semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Instrucciones returns LlamadoFunc
	 *     LlamadoFunc returns LlamadoFunc
	 *     Valor returns LlamadoFunc
	 *     Expresion returns LlamadoFunc
	 *
	 * Constraint:
	 *     (funcionID=[Declaracion|ID] args+=Valor?)
	 * </pre>
	 */
	protected void sequence_LlamadoFunc(ISerializationContext context, LlamadoFunc semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Instrucciones returns Llave
	 *     Llave returns Llave
	 *     Valor returns Llave
	 *     Expresion returns Llave
	 *
	 * Constraint:
	 *     (exprLogCondicion=Expresion acordeRes=Expresion Rep=Expresion)
	 * </pre>
	 */
	protected void sequence_Llave(ISerializationContext context, Llave semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MadonnaPackage.Literals.LLAVE__EXPR_LOG_CONDICION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MadonnaPackage.Literals.LLAVE__EXPR_LOG_CONDICION));
			if (transientValues.isValueTransient(semanticObject, MadonnaPackage.Literals.LLAVE__ACORDE_RES) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MadonnaPackage.Literals.LLAVE__ACORDE_RES));
			if (transientValues.isValueTransient(semanticObject, MadonnaPackage.Literals.LLAVE__REP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MadonnaPackage.Literals.LLAVE__REP));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getLlaveAccess().getExprLogCondicionExpresionParserRuleCall_0_2_0(), semanticObject.getExprLogCondicion());
		feeder.accept(grammarAccess.getLlaveAccess().getAcordeResExpresionParserRuleCall_0_4_0(), semanticObject.getAcordeRes());
		feeder.accept(grammarAccess.getLlaveAccess().getRepExpresionParserRuleCall_1_1_0(), semanticObject.getRep());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Instrucciones returns Melodia
	 *     Valor returns Melodia
	 *     Expresion returns Melodia
	 *     ExprConcatenacion returns Melodia
	 *     Melodia returns Melodia
	 *
	 * Constraint:
	 *     x=STRING
	 * </pre>
	 */
	protected void sequence_Melodia(ISerializationContext context, Melodia semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MadonnaPackage.Literals.MELODIA__X) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MadonnaPackage.Literals.MELODIA__X));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getMelodiaAccess().getXSTRINGTerminalRuleCall_0(), semanticObject.getX());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Instrucciones returns Nota
	 *     Valor returns Nota
	 *     Expresion returns Nota
	 *     ExprAritmetica returns Nota
	 *     Nota returns Nota
	 *
	 * Constraint:
	 *     x=INT
	 * </pre>
	 */
	protected void sequence_Nota(ISerializationContext context, Nota semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MadonnaPackage.Literals.NOTA__X) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MadonnaPackage.Literals.NOTA__X));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getNotaAccess().getXINTTerminalRuleCall_0(), semanticObject.getX());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Instrucciones returns Primitivo
	 *     Declaracion returns Primitivo
	 *     Param returns Primitivo
	 *
	 * Constraint:
	 *     ((tipo='Melodia' | tipo='Nota' | tipo='SubNota' | tipo='Ritmo') name=ID)
	 * </pre>
	 */
	protected void sequence_Param_Primitivo(ISerializationContext context, Primitivo semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Primitivo returns Primitivo
	 *
	 * Constraint:
	 *     (tipo='Melodia' | tipo='Nota' | tipo='SubNota' | tipo='Ritmo')
	 * </pre>
	 */
	protected void sequence_Primitivo(ISerializationContext context, Primitivo semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Print returns Print
	 *     Instrucciones returns Print
	 *     Declaracion returns Print
	 *
	 * Constraint:
	 *     ((printTipo='Melodia' | printTipo='MelodiaLineal') val=Valor)
	 * </pre>
	 */
	protected void sequence_Print(ISerializationContext context, Print semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Programa returns Programa
	 *
	 * Constraint:
	 *     (name=ID prog+=Instrucciones*)
	 * </pre>
	 */
	protected void sequence_Programa(ISerializationContext context, Programa semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Ritmo returns Ritmo
	 *
	 * Constraint:
	 *     (x='Cuarto' | x='Octavo')
	 * </pre>
	 */
	protected void sequence_Ritmo(ISerializationContext context, Ritmo semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Instrucciones returns SubNota
	 *     Valor returns SubNota
	 *     Expresion returns SubNota
	 *     ExprAritmetica returns SubNota
	 *     SubNota returns SubNota
	 *
	 * Constraint:
	 *     x=Double
	 * </pre>
	 */
	protected void sequence_SubNota(ISerializationContext context, SubNota semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MadonnaPackage.Literals.SUB_NOTA__X) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MadonnaPackage.Literals.SUB_NOTA__X));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSubNotaAccess().getXDoubleParserRuleCall_0(), semanticObject.getX());
		feeder.finish();
	}
	
	
}