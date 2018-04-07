/* Tools20022 - API for ISO 20022
* Copyright (C) 2017 Tools20022.com - László Bukodi 
* 
* This program is free software: you can redistribute it and/or modify
* it under the terms of the GNU General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* (at your option) any later version.
* 
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* GNU General Public License for more details.
* 
* You should have received a copy of the GNU General Public License
* along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/

package com.tools20022.repository.entity;

import com.tools20022.metamodel.*;
import com.tools20022.repository.choice.OriginalMandate4Choice;
import com.tools20022.repository.choice.OriginalMandate5Choice;
import com.tools20022.repository.datatype.Max35NumericText;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.datatype.TrueFalseIndicator;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Authorisation given by an issuing party to a holder party to act on the
 * issuer's behalf.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="Mandate" src="doc-files/Mandate.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Contract Contract}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Mandate#mmSignatureConditions
 * Mandate.mmSignatureConditions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Mandate#mmMandateIdentification
 * Mandate.mmMandateIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Mandate#mmOriginalMandate
 * Mandate.mmOriginalMandate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Mandate#mmAmendment
 * Mandate.mmAmendment}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Mandate#mmMandatePartyRole
 * Mandate.mmMandatePartyRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Mandate#mmMandateStatus
 * Mandate.mmMandateStatus}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Mandate#mmAccountContract
 * Mandate.mmAccountContract}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Mandate#mmAuthentication
 * Mandate.mmAuthentication}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Mandate#mmTrackingDays
 * Mandate.mmTrackingDays}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Mandate#mmTrackingIndicator
 * Mandate.mmTrackingIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Mandate#mmRate
 * Mandate.mmRate}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AccountContract#mmAccountAuthorisation
 * AccountContract.mmAccountAuthorisation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SignatureCondition#mmMandate
 * SignatureCondition.mmMandate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.MandatePartyRole#mmMandate
 * MandatePartyRole.mmMandate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Mandate#mmOriginalMandate
 * Mandate.mmOriginalMandate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Mandate#mmAmendment
 * Mandate.mmAmendment}</li>
 * <li>{@linkplain com.tools20022.repository.entity.MandateStatus#mmMandate
 * MandateStatus.mmMandate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Authentication#mmMandate
 * Authentication.mmMandate}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MandateAmendment5#mmOriginalMandate
 * MandateAmendment5.mmOriginalMandate}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.CashAccountMandate
 * CashAccountMandate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.DirectDebitMandate
 * DirectDebitMandate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PowerOfAttorney
 * PowerOfAttorney}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.MandateAmendment5
 * MandateAmendment5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MandateTypeInformation2
 * MandateTypeInformation2}</li>
 * <li>{@linkplain com.tools20022.repository.choice.OriginalMandate4Choice
 * OriginalMandate4Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.OriginalMandate5Choice
 * OriginalMandate5Choice}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Mandate"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Authorisation given by an issuing party to a holder party to act on the issuer's behalf."
 * </li>
 * </ul>
 */
public class Mandate extends Contract {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected List<SignatureCondition> signatureConditions;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SignatureCondition#mmMandate
	 * SignatureCondition.mmMandate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SignatureCondition
	 * SignatureCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Mandate
	 * Mandate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SignatureConditions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the signature requirements related to the document."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Mandate, List<SignatureCondition>> mmSignatureConditions = new MMBusinessAssociationEnd<Mandate, List<SignatureCondition>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> Mandate.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SignatureConditions";
			definition = "Specifies the signature requirements related to the document.";
			minOccurs = 0;
			opposite_lazy = () -> SignatureCondition.mmMandate;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SignatureCondition.mmObject();
		}

		@Override
		public List<SignatureCondition> getValue(Mandate obj) {
			return obj.getSignatureConditions();
		}

		@Override
		public void setValue(Mandate obj, List<SignatureCondition> value) {
			obj.setSignatureConditions(value);
		}
	};
	protected Max35Text mandateIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionReferences4#mmMandateIdentification
	 * TransactionReferences4.mmMandateIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitInstructionDetails1#mmMandateIdentification
	 * DirectDebitInstructionDetails1.mmMandateIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OriginalMandate4Choice#mmOriginalMandateIdentification
	 * OriginalMandate4Choice.mmOriginalMandateIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation11#mmMandateIdentification
	 * MandateRelatedInformation11.mmMandateIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OriginalMandate5Choice#mmOriginalMandateIdentification
	 * OriginalMandate5Choice.mmOriginalMandateIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails11#mmOriginalMandateIdentification
	 * AmendmentInformationDetails11.mmOriginalMandateIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation12#mmMandateIdentification
	 * MandateRelatedInformation12.mmMandateIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails12#mmOriginalMandateIdentification
	 * AmendmentInformationDetails12.mmOriginalMandateIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Mandate
	 * Mandate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MandateIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unique and unambiguous identification of the mandate."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Mandate, Max35Text> mmMandateIdentification = new MMBusinessAttribute<Mandate, Max35Text>() {
		{
			derivation_lazy = () -> Arrays.asList(TransactionReferences4.mmMandateIdentification, DirectDebitInstructionDetails1.mmMandateIdentification, OriginalMandate4Choice.mmOriginalMandateIdentification,
					MandateRelatedInformation11.mmMandateIdentification, OriginalMandate5Choice.mmOriginalMandateIdentification, AmendmentInformationDetails11.mmOriginalMandateIdentification,
					MandateRelatedInformation12.mmMandateIdentification, AmendmentInformationDetails12.mmOriginalMandateIdentification);
			isDerived = false;
			elementContext_lazy = () -> Mandate.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MandateIdentification";
			definition = "Unique and unambiguous identification of the mandate.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(Mandate obj) {
			return obj.getMandateIdentification();
		}

		@Override
		public void setValue(Mandate obj, Max35Text value) {
			obj.setMandateIdentification(value);
		}
	};
	protected Mandate originalMandate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Mandate#mmAmendment
	 * Mandate.mmAmendment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Mandate Mandate}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateAcceptance5#mmOriginalMandate
	 * MandateAcceptance5.mmOriginalMandate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Mandate
	 * Mandate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalMandate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Mandate which is amended."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Mandate, Mandate> mmOriginalMandate = new MMBusinessAssociationEnd<Mandate, Mandate>() {
		{
			derivation_lazy = () -> Arrays.asList(MandateAcceptance5.mmOriginalMandate);
			isDerived = false;
			elementContext_lazy = () -> Mandate.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OriginalMandate";
			definition = "Mandate which is amended.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> Mandate.mmAmendment;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Mandate.mmObject();
		}

		@Override
		public Mandate getValue(Mandate obj) {
			return obj.getOriginalMandate();
		}

		@Override
		public void setValue(Mandate obj, Mandate value) {
			obj.setOriginalMandate(value);
		}
	};
	protected Mandate amendment;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Mandate#mmOriginalMandate
	 * Mandate.mmOriginalMandate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Mandate Mandate}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Mandate10#mmAdjustment
	 * Mandate10.mmAdjustment}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Mandate9#mmAdjustment
	 * Mandate9.mmAdjustment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation11#mmAmendmentIndicator
	 * MandateRelatedInformation11.mmAmendmentIndicator}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Mandate11#mmAdjustment
	 * Mandate11.mmAdjustment}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Mandate8#mmAdjustment
	 * Mandate8.mmAdjustment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation12#mmAmendmentIndicator
	 * MandateRelatedInformation12.mmAmendmentIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Mandate
	 * Mandate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Amendment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Improvement on a mandate."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Mandate, Mandate> mmAmendment = new MMBusinessAssociationEnd<Mandate, Mandate>() {
		{
			derivation_lazy = () -> Arrays.asList(Mandate10.mmAdjustment, Mandate9.mmAdjustment, MandateRelatedInformation11.mmAmendmentIndicator, Mandate11.mmAdjustment, Mandate8.mmAdjustment,
					MandateRelatedInformation12.mmAmendmentIndicator);
			isDerived = false;
			elementContext_lazy = () -> Mandate.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Amendment";
			definition = "Improvement on a mandate.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> Mandate.mmOriginalMandate;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Mandate.mmObject();
		}

		@Override
		public Mandate getValue(Mandate obj) {
			return obj.getAmendment();
		}

		@Override
		public void setValue(Mandate obj, Mandate value) {
			obj.setAmendment(value);
		}
	};
	protected List<com.tools20022.repository.entity.MandatePartyRole> mandatePartyRole;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.MandatePartyRole#mmMandate
	 * MandatePartyRole.mmMandate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.MandatePartyRole
	 * MandatePartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Mandate
	 * Mandate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MandatePartyRole"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies each role linked to a mandate and played by a party in that context."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Mandate, List<MandatePartyRole>> mmMandatePartyRole = new MMBusinessAssociationEnd<Mandate, List<MandatePartyRole>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> Mandate.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MandatePartyRole";
			definition = "Specifies each role linked to a mandate and played by a party in that context.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.MandatePartyRole.mmMandate;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.MandatePartyRole.mmObject();
		}

		@Override
		public List<MandatePartyRole> getValue(Mandate obj) {
			return obj.getMandatePartyRole();
		}

		@Override
		public void setValue(Mandate obj, List<MandatePartyRole> value) {
			obj.setMandatePartyRole(value);
		}
	};
	protected List<com.tools20022.repository.entity.MandateStatus> mandateStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.MandateStatus#mmMandate
	 * MandateStatus.mmMandate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.MandateStatus
	 * MandateStatus}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateAcceptance5#mmAcceptanceResult
	 * MandateAcceptance5.mmAcceptanceResult}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Mandate
	 * Mandate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MandateStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the status of a mandate"</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Mandate, List<MandateStatus>> mmMandateStatus = new MMBusinessAssociationEnd<Mandate, List<MandateStatus>>() {
		{
			derivation_lazy = () -> Arrays.asList(MandateAcceptance5.mmAcceptanceResult);
			isDerived = false;
			elementContext_lazy = () -> Mandate.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MandateStatus";
			definition = "Specifies the status of a mandate";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.MandateStatus.mmMandate;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.MandateStatus.mmObject();
		}

		@Override
		public List<MandateStatus> getValue(Mandate obj) {
			return obj.getMandateStatus();
		}

		@Override
		public void setValue(Mandate obj, List<MandateStatus> value) {
			obj.setMandateStatus(value);
		}
	};
	protected AccountContract accountContract;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.AccountContract#mmAccountAuthorisation
	 * AccountContract.mmAccountAuthorisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.AccountContract
	 * AccountContract}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Mandate
	 * Mandate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountContract"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Contract on which a mandate applies."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Mandate, Optional<AccountContract>> mmAccountContract = new MMBusinessAssociationEnd<Mandate, Optional<AccountContract>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> Mandate.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AccountContract";
			definition = "Contract on which a mandate applies.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.AccountContract.mmAccountAuthorisation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.AccountContract.mmObject();
		}

		@Override
		public Optional<AccountContract> getValue(Mandate obj) {
			return obj.getAccountContract();
		}

		@Override
		public void setValue(Mandate obj, Optional<AccountContract> value) {
			obj.setAccountContract(value.orElse(null));
		}
	};
	protected Authentication authentication;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Authentication#mmMandate
	 * Authentication.mmMandate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Authentication
	 * Authentication}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Mandate10#mmAuthentication
	 * Mandate10.mmAuthentication}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Mandate9#mmAuthentication
	 * Mandate9.mmAuthentication}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Mandate11#mmAuthentication
	 * Mandate11.mmAuthentication}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Mandate8#mmAuthentication
	 * Mandate8.mmAuthentication}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Mandate
	 * Mandate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Authentication"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the transport authentication details related to the mandate."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Mandate, com.tools20022.repository.entity.Authentication> mmAuthentication = new MMBusinessAssociationEnd<Mandate, com.tools20022.repository.entity.Authentication>() {
		{
			derivation_lazy = () -> Arrays.asList(Mandate10.mmAuthentication, Mandate9.mmAuthentication, Mandate11.mmAuthentication, Mandate8.mmAuthentication);
			isDerived = false;
			elementContext_lazy = () -> Mandate.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Authentication";
			definition = "Specifies the transport authentication details related to the mandate.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Authentication.mmMandate;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Authentication.mmObject();
		}

		@Override
		public com.tools20022.repository.entity.Authentication getValue(Mandate obj) {
			return obj.getAuthentication();
		}

		@Override
		public void setValue(Mandate obj, com.tools20022.repository.entity.Authentication value) {
			obj.setAuthentication(value);
		}
	};
	protected Max35NumericText trackingDays;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max35NumericText
	 * Max35NumericText}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation11#mmTrackingDays
	 * MandateRelatedInformation11.mmTrackingDays}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails11#mmOriginalTrackingDays
	 * AmendmentInformationDetails11.mmOriginalTrackingDays}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation12#mmTrackingDays
	 * MandateRelatedInformation12.mmTrackingDays}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails12#mmOriginalTrackingDays
	 * AmendmentInformationDetails12.mmOriginalTrackingDays}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Mandate
	 * Mandate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TrackingDays"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the number of days the mandate must be tracked."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Mandate, Max35NumericText> mmTrackingDays = new MMBusinessAttribute<Mandate, Max35NumericText>() {
		{
			derivation_lazy = () -> Arrays.asList(MandateRelatedInformation11.mmTrackingDays, AmendmentInformationDetails11.mmOriginalTrackingDays, MandateRelatedInformation12.mmTrackingDays,
					AmendmentInformationDetails12.mmOriginalTrackingDays);
			isDerived = false;
			elementContext_lazy = () -> Mandate.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TrackingDays";
			definition = "Specifies the number of days the mandate must be tracked.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35NumericText.mmObject();
		}

		@Override
		public Max35NumericText getValue(Mandate obj) {
			return obj.getTrackingDays();
		}

		@Override
		public void setValue(Mandate obj, Max35NumericText value) {
			obj.setTrackingDays(value);
		}
	};
	protected TrueFalseIndicator trackingIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.TrueFalseIndicator
	 * TrueFalseIndicator}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Mandate10#mmTrackingIndicator
	 * Mandate10.mmTrackingIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Mandate9#mmTrackingIndicator
	 * Mandate9.mmTrackingIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Mandate11#mmTrackingIndicator
	 * Mandate11.mmTrackingIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Mandate8#mmTrackingIndicator
	 * Mandate8.mmTrackingIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Mandate
	 * Mandate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TrackingIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the direct debit instructions should be automatically re-submitted periodically when bilaterally agreed."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Mandate, TrueFalseIndicator> mmTrackingIndicator = new MMBusinessAttribute<Mandate, TrueFalseIndicator>() {
		{
			derivation_lazy = () -> Arrays.asList(Mandate10.mmTrackingIndicator, Mandate9.mmTrackingIndicator, Mandate11.mmTrackingIndicator, Mandate8.mmTrackingIndicator);
			isDerived = false;
			elementContext_lazy = () -> Mandate.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TrackingIndicator";
			definition = "Specifies whether the direct debit instructions should be automatically re-submitted periodically when bilaterally agreed.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}

		@Override
		public TrueFalseIndicator getValue(Mandate obj) {
			return obj.getTrackingIndicator();
		}

		@Override
		public void setValue(Mandate obj, TrueFalseIndicator value) {
			obj.setTrackingIndicator(value);
		}
	};
	protected PercentageRate rate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PercentageRate
	 * PercentageRate}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.MandateAdjustment1#mmRate
	 * MandateAdjustment1.mmRate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Mandate
	 * Mandate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Rate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Pre-agreed increase or decrease rate that will be applied to the collection amount."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Mandate, PercentageRate> mmRate = new MMBusinessAttribute<Mandate, PercentageRate>() {
		{
			derivation_lazy = () -> Arrays.asList(MandateAdjustment1.mmRate);
			isDerived = false;
			elementContext_lazy = () -> Mandate.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Rate";
			definition = "Pre-agreed increase or decrease rate that will be applied to the collection amount.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		@Override
		public PercentageRate getValue(Mandate obj) {
			return obj.getRate();
		}

		@Override
		public void setValue(Mandate obj, PercentageRate value) {
			obj.setRate(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Mandate";
				definition = "Authorisation given by an issuing party to a holder party to act on the issuer's behalf.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.AccountContract.mmAccountAuthorisation, SignatureCondition.mmMandate, com.tools20022.repository.entity.MandatePartyRole.mmMandate,
						Mandate.mmOriginalMandate, Mandate.mmAmendment, com.tools20022.repository.entity.MandateStatus.mmMandate, com.tools20022.repository.entity.Authentication.mmMandate);
				derivationElement_lazy = () -> Arrays.asList(MandateAmendment5.mmOriginalMandate);
				subType_lazy = () -> Arrays.asList(CashAccountMandate.mmObject(), DirectDebitMandate.mmObject(), PowerOfAttorney.mmObject());
				superType_lazy = () -> Contract.mmObject();
				element_lazy = () -> Arrays.asList(Mandate.mmSignatureConditions, Mandate.mmMandateIdentification, Mandate.mmOriginalMandate, Mandate.mmAmendment, Mandate.mmMandatePartyRole, Mandate.mmMandateStatus,
						Mandate.mmAccountContract, Mandate.mmAuthentication, Mandate.mmTrackingDays, Mandate.mmTrackingIndicator, Mandate.mmRate);
				derivationComponent_lazy = () -> Arrays.asList(MandateAmendment5.mmObject(), MandateTypeInformation2.mmObject(), OriginalMandate4Choice.mmObject(), OriginalMandate5Choice.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return Mandate.class;
			}
		});
		return mmObject_lazy.get();
	}

	public List<SignatureCondition> getSignatureConditions() {
		return signatureConditions == null ? signatureConditions = new ArrayList<>() : signatureConditions;
	}

	public Mandate setSignatureConditions(List<SignatureCondition> signatureConditions) {
		this.signatureConditions = Objects.requireNonNull(signatureConditions);
		return this;
	}

	public Max35Text getMandateIdentification() {
		return mandateIdentification;
	}

	public Mandate setMandateIdentification(Max35Text mandateIdentification) {
		this.mandateIdentification = Objects.requireNonNull(mandateIdentification);
		return this;
	}

	public Mandate getOriginalMandate() {
		return originalMandate;
	}

	public Mandate setOriginalMandate(Mandate originalMandate) {
		this.originalMandate = Objects.requireNonNull(originalMandate);
		return this;
	}

	public Mandate getAmendment() {
		return amendment;
	}

	public Mandate setAmendment(Mandate amendment) {
		this.amendment = Objects.requireNonNull(amendment);
		return this;
	}

	public List<MandatePartyRole> getMandatePartyRole() {
		return mandatePartyRole == null ? mandatePartyRole = new ArrayList<>() : mandatePartyRole;
	}

	public Mandate setMandatePartyRole(List<com.tools20022.repository.entity.MandatePartyRole> mandatePartyRole) {
		this.mandatePartyRole = Objects.requireNonNull(mandatePartyRole);
		return this;
	}

	public List<MandateStatus> getMandateStatus() {
		return mandateStatus == null ? mandateStatus = new ArrayList<>() : mandateStatus;
	}

	public Mandate setMandateStatus(List<com.tools20022.repository.entity.MandateStatus> mandateStatus) {
		this.mandateStatus = Objects.requireNonNull(mandateStatus);
		return this;
	}

	public Optional<AccountContract> getAccountContract() {
		return accountContract == null ? Optional.empty() : Optional.of(accountContract);
	}

	public Mandate setAccountContract(com.tools20022.repository.entity.AccountContract accountContract) {
		this.accountContract = accountContract;
		return this;
	}

	public Authentication getAuthentication() {
		return authentication;
	}

	public Mandate setAuthentication(com.tools20022.repository.entity.Authentication authentication) {
		this.authentication = Objects.requireNonNull(authentication);
		return this;
	}

	public Max35NumericText getTrackingDays() {
		return trackingDays;
	}

	public Mandate setTrackingDays(Max35NumericText trackingDays) {
		this.trackingDays = Objects.requireNonNull(trackingDays);
		return this;
	}

	public TrueFalseIndicator getTrackingIndicator() {
		return trackingIndicator;
	}

	public Mandate setTrackingIndicator(TrueFalseIndicator trackingIndicator) {
		this.trackingIndicator = Objects.requireNonNull(trackingIndicator);
		return this;
	}

	public PercentageRate getRate() {
		return rate;
	}

	public Mandate setRate(PercentageRate rate) {
		this.rate = Objects.requireNonNull(rate);
		return this;
	}
}