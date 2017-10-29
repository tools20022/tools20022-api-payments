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

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.choice.OriginalMandate4Choice;
import com.tools20022.repository.choice.OriginalMandate5Choice;
import com.tools20022.repository.datatype.Max35NumericText;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.datatype.TrueFalseIndicator;
import com.tools20022.repository.entity.Contract;
import com.tools20022.repository.msg.MandateAmendment5;
import com.tools20022.repository.msg.MandateTypeInformation2;
import java.util.Arrays;
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
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Mandate#SignatureConditions
 * Mandate.SignatureConditions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Mandate#MandateIdentification
 * Mandate.MandateIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Mandate#OriginalMandate
 * Mandate.OriginalMandate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Mandate#Amendment
 * Mandate.Amendment}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Mandate#MandatePartyRole
 * Mandate.MandatePartyRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Mandate#MandateStatus
 * Mandate.MandateStatus}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Mandate#AccountContract
 * Mandate.AccountContract}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Mandate#Authentication
 * Mandate.Authentication}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Mandate#TrackingDays
 * Mandate.TrackingDays}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Mandate#TrackingIndicator
 * Mandate.TrackingIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Mandate#Rate Mandate.Rate}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AccountContract#AccountAuthorisation
 * AccountContract.AccountAuthorisation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SignatureCondition#Mandate
 * SignatureCondition.Mandate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.MandatePartyRole#Mandate
 * MandatePartyRole.Mandate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Mandate#OriginalMandate
 * Mandate.OriginalMandate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Mandate#Amendment
 * Mandate.Amendment}</li>
 * <li>{@linkplain com.tools20022.repository.entity.MandateStatus#Mandate
 * MandateStatus.Mandate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Authentication#Mandate
 * Authentication.Mandate}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MandateAmendment5#OriginalMandate
 * MandateAmendment5.OriginalMandate}</li>
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
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Contract Contract}</li>
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
	/**
	 * Specifies the signature requirements related to the document.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SignatureCondition#Mandate
	 * SignatureCondition.Mandate}</li>
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
	public static final MMBusinessAssociationEnd SignatureConditions = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Mandate.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SignatureConditions";
			definition = "Specifies the signature requirements related to the document.";
			minOccurs = 0;
			type_lazy = () -> SignatureCondition.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SignatureCondition.Mandate;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Unique and unambiguous identification of the mandate.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.TransactionReferences4#MandateIdentification
	 * TransactionReferences4.MandateIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OriginalMandate4Choice#OriginalMandateIdentification
	 * OriginalMandate4Choice.OriginalMandateIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation11#MandateIdentification
	 * MandateRelatedInformation11.MandateIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OriginalMandate5Choice#OriginalMandateIdentification
	 * OriginalMandate5Choice.OriginalMandateIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails11#OriginalMandateIdentification
	 * AmendmentInformationDetails11.OriginalMandateIdentification}</li>
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
	public static final MMBusinessAttribute MandateIdentification = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TransactionReferences4.MandateIdentification, com.tools20022.repository.choice.OriginalMandate4Choice.OriginalMandateIdentification,
					com.tools20022.repository.msg.MandateRelatedInformation11.MandateIdentification, com.tools20022.repository.choice.OriginalMandate5Choice.OriginalMandateIdentification,
					com.tools20022.repository.msg.AmendmentInformationDetails11.OriginalMandateIdentification);
			elementContext_lazy = () -> Mandate.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MandateIdentification";
			definition = "Unique and unambiguous identification of the mandate.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Mandate which is amended.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Mandate#Amendment
	 * Mandate.Amendment}</li>
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
	 * {@linkplain com.tools20022.repository.msg.MandateAcceptance5#OriginalMandate
	 * MandateAcceptance5.OriginalMandate}</li>
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
	public static final MMBusinessAssociationEnd OriginalMandate = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.MandateAcceptance5.OriginalMandate);
			elementContext_lazy = () -> Mandate.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OriginalMandate";
			definition = "Mandate which is amended.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> Mandate.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Mandate.Amendment;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Improvement on a mandate.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Mandate#OriginalMandate
	 * Mandate.OriginalMandate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Mandate Mandate}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Mandate10#Adjustment
	 * Mandate10.Adjustment}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Mandate9#Adjustment
	 * Mandate9.Adjustment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation11#AmendmentIndicator
	 * MandateRelatedInformation11.AmendmentIndicator}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Mandate11#Adjustment
	 * Mandate11.Adjustment}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Mandate8#Adjustment
	 * Mandate8.Adjustment}</li>
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
	public static final MMBusinessAssociationEnd Amendment = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Mandate10.Adjustment, com.tools20022.repository.msg.Mandate9.Adjustment, com.tools20022.repository.msg.MandateRelatedInformation11.AmendmentIndicator,
					com.tools20022.repository.msg.Mandate11.Adjustment, com.tools20022.repository.msg.Mandate8.Adjustment);
			elementContext_lazy = () -> Mandate.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Amendment";
			definition = "Improvement on a mandate.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> Mandate.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Mandate.OriginalMandate;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies each role linked to a mandate and played by a party in that
	 * context.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.MandatePartyRole#Mandate
	 * MandatePartyRole.Mandate}</li>
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
	public static final MMBusinessAssociationEnd MandatePartyRole = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Mandate.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MandatePartyRole";
			definition = "Specifies each role linked to a mandate and played by a party in that context.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.MandatePartyRole.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.MandatePartyRole.Mandate;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the status of a mandate
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.MandateStatus#Mandate
	 * MandateStatus.Mandate}</li>
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
	 * {@linkplain com.tools20022.repository.msg.MandateAcceptance5#AcceptanceResult
	 * MandateAcceptance5.AcceptanceResult}</li>
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
	public static final MMBusinessAssociationEnd MandateStatus = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.MandateAcceptance5.AcceptanceResult);
			elementContext_lazy = () -> Mandate.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MandateStatus";
			definition = "Specifies the status of a mandate";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.MandateStatus.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.MandateStatus.Mandate;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Contract on which a mandate applies.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.AccountContract#AccountAuthorisation
	 * AccountContract.AccountAuthorisation}</li>
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
	public static final MMBusinessAssociationEnd AccountContract = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Mandate.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AccountContract";
			definition = "Contract on which a mandate applies.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.AccountContract.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.AccountContract.AccountAuthorisation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the transport authentication details related to the mandate.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Authentication#Mandate
	 * Authentication.Mandate}</li>
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
	 * <li>{@linkplain com.tools20022.repository.msg.Mandate10#Authentication
	 * Mandate10.Authentication}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Mandate9#Authentication
	 * Mandate9.Authentication}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Mandate11#Authentication
	 * Mandate11.Authentication}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Mandate8#Authentication
	 * Mandate8.Authentication}</li>
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
	public static final MMBusinessAssociationEnd Authentication = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Mandate10.Authentication, com.tools20022.repository.msg.Mandate9.Authentication, com.tools20022.repository.msg.Mandate11.Authentication,
					com.tools20022.repository.msg.Mandate8.Authentication);
			elementContext_lazy = () -> Mandate.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Authentication";
			definition = "Specifies the transport authentication details related to the mandate.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Authentication.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Authentication.Mandate;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the number of days the mandate must be tracked.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation11#TrackingDays
	 * MandateRelatedInformation11.TrackingDays}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails11#OriginalTrackingDays
	 * AmendmentInformationDetails11.OriginalTrackingDays}</li>
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
	public static final MMBusinessAttribute TrackingDays = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.MandateRelatedInformation11.TrackingDays, com.tools20022.repository.msg.AmendmentInformationDetails11.OriginalTrackingDays);
			elementContext_lazy = () -> Mandate.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TrackingDays";
			definition = "Specifies the number of days the mandate must be tracked.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35NumericText.mmObject();
		}
	};
	/**
	 * Specifies whether the direct debit instructions should be automatically
	 * re-submitted periodically when bilaterally agreed.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.Mandate10#TrackingIndicator
	 * Mandate10.TrackingIndicator}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Mandate9#TrackingIndicator
	 * Mandate9.TrackingIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Mandate11#TrackingIndicator
	 * Mandate11.TrackingIndicator}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Mandate8#TrackingIndicator
	 * Mandate8.TrackingIndicator}</li>
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
	public static final MMBusinessAttribute TrackingIndicator = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Mandate10.TrackingIndicator, com.tools20022.repository.msg.Mandate9.TrackingIndicator, com.tools20022.repository.msg.Mandate11.TrackingIndicator,
					com.tools20022.repository.msg.Mandate8.TrackingIndicator);
			elementContext_lazy = () -> Mandate.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TrackingIndicator";
			definition = "Specifies whether the direct debit instructions should be automatically re-submitted periodically when bilaterally agreed.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}
	};
	/**
	 * Pre-agreed increase or decrease rate that will be applied to the
	 * collection amount.
	 * <p>
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
	 * <li>{@linkplain com.tools20022.repository.msg.MandateAdjustment1#Rate
	 * MandateAdjustment1.Rate}</li>
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
	public static final MMBusinessAttribute Rate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.MandateAdjustment1.Rate);
			elementContext_lazy = () -> Mandate.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Rate";
			definition = "Pre-agreed increase or decrease rate that will be applied to the collection amount.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Mandate";
				definition = "Authorisation given by an issuing party to a holder party to act on the issuer's behalf.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.AccountContract.AccountAuthorisation, com.tools20022.repository.entity.SignatureCondition.Mandate,
						com.tools20022.repository.entity.MandatePartyRole.Mandate, com.tools20022.repository.entity.Mandate.OriginalMandate, com.tools20022.repository.entity.Mandate.Amendment,
						com.tools20022.repository.entity.MandateStatus.Mandate, com.tools20022.repository.entity.Authentication.Mandate);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.MandateAmendment5.OriginalMandate);
				subType_lazy = () -> Arrays.asList(CashAccountMandate.mmObject(), DirectDebitMandate.mmObject(), PowerOfAttorney.mmObject());
				superType_lazy = () -> Contract.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Mandate.SignatureConditions, com.tools20022.repository.entity.Mandate.MandateIdentification, com.tools20022.repository.entity.Mandate.OriginalMandate,
						com.tools20022.repository.entity.Mandate.Amendment, com.tools20022.repository.entity.Mandate.MandatePartyRole, com.tools20022.repository.entity.Mandate.MandateStatus,
						com.tools20022.repository.entity.Mandate.AccountContract, com.tools20022.repository.entity.Mandate.Authentication, com.tools20022.repository.entity.Mandate.TrackingDays,
						com.tools20022.repository.entity.Mandate.TrackingIndicator, com.tools20022.repository.entity.Mandate.Rate);
				derivationComponent_lazy = () -> Arrays.asList(MandateAmendment5.mmObject(), MandateTypeInformation2.mmObject(), OriginalMandate4Choice.mmObject(), OriginalMandate5Choice.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}