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
import com.tools20022.repository.codeset.FrequencyCode;
import com.tools20022.repository.codeset.MandateClassificationCode;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.datatype.TrueFalseIndicator;
import com.tools20022.repository.entity.Mandate;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Authorisation in favour of the creditor given by the debtor to debit its own
 * account.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="DirectDebitMandate" src="doc-files/DirectDebitMandate.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DirectDebitMandate#RelatedDirectDebit
 * DirectDebitMandate.RelatedDirectDebit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DirectDebitMandate#FinalCollectionDate
 * DirectDebitMandate.FinalCollectionDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DirectDebitMandate#Frequency
 * DirectDebitMandate.Frequency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DirectDebitMandate#FirstCollectionDate
 * DirectDebitMandate.FirstCollectionDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DirectDebitMandate#MandatePaymentType
 * DirectDebitMandate.MandatePaymentType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DirectDebitMandate#CollectionAmount
 * DirectDebitMandate.CollectionAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DirectDebitMandate#MaximumAmount
 * DirectDebitMandate.MaximumAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DirectDebitMandate#PreNotification
 * DirectDebitMandate.PreNotification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DirectDebitMandate#PreNotificationThreshold
 * DirectDebitMandate.PreNotificationThreshold}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DirectDebitMandate#Classification
 * DirectDebitMandate.Classification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DirectDebitMandate#PointInTime
 * DirectDebitMandate.PointInTime}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DirectDebit#DirectDebitMandate
 * DirectDebit.DirectDebitMandate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentProcessing#RelatedMandate
 * PaymentProcessing.RelatedMandate}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Mandate10#Occurrences
 * Mandate10.Occurrences}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MandateAmendment5#Mandate
 * MandateAmendment5.Mandate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.OriginalMandate4Choice#OriginalMandate
 * OriginalMandate4Choice.OriginalMandate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Mandate9#Occurrences
 * Mandate9.Occurrences}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference24#MandateRelatedInformation
 * OriginalTransactionReference24.MandateRelatedInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation11#AmendmentInformationDetails
 * MandateRelatedInformation11.AmendmentInformationDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Mandate11#Occurrences
 * Mandate11.Occurrences}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Mandate8#Occurrences
 * Mandate8.Occurrences}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.OriginalMandate5Choice#OriginalMandate
 * OriginalMandate5Choice.OriginalMandate}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Mandate Mandate}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Mandate10 Mandate10}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MandateAcceptance5
 * MandateAcceptance5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Mandate9 Mandate9}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MandateRelatedInformation11
 * MandateRelatedInformation11}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Mandate11 Mandate11}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MandateAdjustment1
 * MandateAdjustment1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MandateOccurrences4
 * MandateOccurrences4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Mandate8 Mandate8}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AmendmentInformationDetails11
 * AmendmentInformationDetails11}</li>
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
 * "DirectDebitMandate"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Authorisation in favour of the creditor given by the debtor to debit its own account."
 * </li>
 * </ul>
 */
public class DirectDebitMandate extends Mandate {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Direct debit to which a mandate applies.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DirectDebit#DirectDebitMandate
	 * DirectDebit.DirectDebitMandate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.DirectDebit
	 * DirectDebit}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.DirectDebitMandate
	 * DirectDebitMandate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedDirectDebit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Direct debit to which a mandate applies."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedDirectDebit = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> DirectDebitMandate.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedDirectDebit";
			definition = "Direct debit to which a mandate applies.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> DirectDebit.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.DirectDebit.DirectDebitMandate;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Date of the final collection of a direct debit as per the mandate.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation11#FinalCollectionDate
	 * MandateRelatedInformation11.FinalCollectionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateOccurrences4#FinalCollectionDate
	 * MandateOccurrences4.FinalCollectionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails11#OriginalFinalCollectionDate
	 * AmendmentInformationDetails11.OriginalFinalCollectionDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.DirectDebitMandate
	 * DirectDebitMandate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinalCollectionDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date of the final collection of a direct debit as per the mandate."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute FinalCollectionDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.MandateRelatedInformation11.FinalCollectionDate, com.tools20022.repository.msg.MandateOccurrences4.FinalCollectionDate,
					com.tools20022.repository.msg.AmendmentInformationDetails11.OriginalFinalCollectionDate);
			elementContext_lazy = () -> DirectDebitMandate.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FinalCollectionDate";
			definition = "Date of the final collection of a direct debit as per the mandate.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	/**
	 * Regularity with which direct debit instructions are to be created and
	 * processed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.FrequencyCode
	 * FrequencyCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation11#Frequency
	 * MandateRelatedInformation11.Frequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateAdjustment1#Category
	 * MandateAdjustment1.Category}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateOccurrences4#Frequency
	 * MandateOccurrences4.Frequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails11#OriginalFrequency
	 * AmendmentInformationDetails11.OriginalFrequency}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.DirectDebitMandate
	 * DirectDebitMandate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Frequency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Regularity with which direct debit instructions are to be created and processed."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Frequency = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.MandateRelatedInformation11.Frequency, com.tools20022.repository.msg.MandateAdjustment1.Category, com.tools20022.repository.msg.MandateOccurrences4.Frequency,
					com.tools20022.repository.msg.AmendmentInformationDetails11.OriginalFrequency);
			elementContext_lazy = () -> DirectDebitMandate.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Frequency";
			definition = "Regularity with which direct debit instructions are to be created and processed.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> FrequencyCode.mmObject();
		}
	};
	/**
	 * Date of the first collection of a direct debit as per the mandate.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation11#FirstCollectionDate
	 * MandateRelatedInformation11.FirstCollectionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateOccurrences4#FirstCollectionDate
	 * MandateOccurrences4.FirstCollectionDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.DirectDebitMandate
	 * DirectDebitMandate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FirstCollectionDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date of the first collection of a direct debit as per the mandate."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute FirstCollectionDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.MandateRelatedInformation11.FirstCollectionDate, com.tools20022.repository.msg.MandateOccurrences4.FirstCollectionDate);
			elementContext_lazy = () -> DirectDebitMandate.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FirstCollectionDate";
			definition = "Date of the first collection of a direct debit as per the mandate.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	/**
	 * Set of elements that further identifies the type of mandate (service
	 * level and/or paper or electronic) being requested or given by the
	 * initiating party.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PaymentProcessing#RelatedMandate
	 * PaymentProcessing.RelatedMandate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.PaymentProcessing
	 * PaymentProcessing}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Mandate10#Type
	 * Mandate10.Type}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateTypeInformation2#LocalInstrument
	 * MandateTypeInformation2.LocalInstrument}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Mandate9#Type
	 * Mandate9.Type}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Mandate11#Type
	 * Mandate11.Type}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Mandate8#Type
	 * Mandate8.Type}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.DirectDebitMandate
	 * DirectDebitMandate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MandatePaymentType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Set of elements that further identifies the type of mandate (service level and/or paper or electronic) being requested or given by the initiating party."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd MandatePaymentType = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Mandate10.Type, com.tools20022.repository.msg.MandateTypeInformation2.LocalInstrument, com.tools20022.repository.msg.Mandate9.Type,
					com.tools20022.repository.msg.Mandate11.Type, com.tools20022.repository.msg.Mandate8.Type);
			elementContext_lazy = () -> DirectDebitMandate.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MandatePaymentType";
			definition = "Set of elements that further identifies the type of mandate (service level and/or paper or electronic) being requested or given by the initiating party.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> PaymentProcessing.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentProcessing.RelatedMandate;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Fixed amount that the debtor has agreed will be collected from their
	 * account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Mandate10#FirstCollectionAmount
	 * Mandate10.FirstCollectionAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Mandate10#CollectionAmount
	 * Mandate10.CollectionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Mandate9#FirstCollectionAmount
	 * Mandate9.FirstCollectionAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Mandate9#CollectionAmount
	 * Mandate9.CollectionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Mandate11#FirstCollectionAmount
	 * Mandate11.FirstCollectionAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Mandate11#CollectionAmount
	 * Mandate11.CollectionAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.MandateAdjustment1#Amount
	 * MandateAdjustment1.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Mandate8#FirstCollectionAmount
	 * Mandate8.FirstCollectionAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Mandate8#CollectionAmount
	 * Mandate8.CollectionAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.DirectDebitMandate
	 * DirectDebitMandate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollectionAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Fixed amount that the debtor has agreed will be collected from their account."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute CollectionAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Mandate10.FirstCollectionAmount, com.tools20022.repository.msg.Mandate10.CollectionAmount, com.tools20022.repository.msg.Mandate9.FirstCollectionAmount,
					com.tools20022.repository.msg.Mandate9.CollectionAmount, com.tools20022.repository.msg.Mandate11.FirstCollectionAmount, com.tools20022.repository.msg.Mandate11.CollectionAmount,
					com.tools20022.repository.msg.MandateAdjustment1.Amount, com.tools20022.repository.msg.Mandate8.FirstCollectionAmount, com.tools20022.repository.msg.Mandate8.CollectionAmount);
			elementContext_lazy = () -> DirectDebitMandate.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CollectionAmount";
			definition = "Fixed amount that the debtor has agreed will be collected from their account.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Maximum amount that may be collected from the debtor's account, per
	 * instruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Mandate10#MaximumAmount
	 * Mandate10.MaximumAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Mandate9#MaximumAmount
	 * Mandate9.MaximumAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Mandate11#MaximumAmount
	 * Mandate11.MaximumAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Mandate8#MaximumAmount
	 * Mandate8.MaximumAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.DirectDebitMandate
	 * DirectDebitMandate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaximumAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Maximum amount that may be collected from the debtor's account, per instruction."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute MaximumAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Mandate10.MaximumAmount, com.tools20022.repository.msg.Mandate9.MaximumAmount, com.tools20022.repository.msg.Mandate11.MaximumAmount,
					com.tools20022.repository.msg.Mandate8.MaximumAmount);
			elementContext_lazy = () -> DirectDebitMandate.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MaximumAmount";
			definition = "Maximum amount that may be collected from the debtor's account, per instruction.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Indicates wether a pre-notification must be sent by the creditor to the
	 * debtor before a direct debit occurs
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.TrueFalseIndicator
	 * TrueFalseIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.DirectDebitMandate
	 * DirectDebitMandate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreNotification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates wether a pre-notification must be sent by the creditor to the debtor before a direct debit occurs"
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute PreNotification = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> DirectDebitMandate.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PreNotification";
			definition = "Indicates wether a pre-notification must be sent by the creditor to the debtor before a direct debit occurs";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}
	};
	/**
	 * Specifies the number of days before the direct debit for notifying the
	 * debtor.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.DirectDebitMandate
	 * DirectDebitMandate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreNotificationThreshold"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the number of days before the direct debit for notifying the debtor."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute PreNotificationThreshold = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> DirectDebitMandate.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PreNotificationThreshold";
			definition = "Specifies the number of days before the direct debit for notifying the debtor.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	/**
	 * Type of direct debit instruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.MandateClassificationCode
	 * MandateClassificationCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateTypeInformation2#Classification
	 * MandateTypeInformation2.Classification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.DirectDebitMandate
	 * DirectDebitMandate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Classification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of direct debit instruction."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Classification = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.MandateTypeInformation2.Classification);
			elementContext_lazy = () -> DirectDebitMandate.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Classification";
			definition = "Type of direct debit instruction.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> MandateClassificationCode.mmObject();
		}
	};
	/**
	 * Specifies a frequency in terms of an exact point in time or moment within
	 * a specified period type.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.FrequencyCode
	 * FrequencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.DirectDebitMandate
	 * DirectDebitMandate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PointInTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies a frequency in terms of an exact point in time or moment within a specified period type."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute PointInTime = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> DirectDebitMandate.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PointInTime";
			definition = "Specifies a frequency in terms of an exact point in time or moment within a specified period type.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> FrequencyCode.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "DirectDebitMandate";
				definition = "Authorisation in favour of the creditor given by the debtor to debit its own account.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.DirectDebit.DirectDebitMandate, com.tools20022.repository.entity.PaymentProcessing.RelatedMandate);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Mandate10.Occurrences, com.tools20022.repository.msg.MandateAmendment5.Mandate,
						com.tools20022.repository.choice.OriginalMandate4Choice.OriginalMandate, com.tools20022.repository.msg.Mandate9.Occurrences, com.tools20022.repository.msg.OriginalTransactionReference24.MandateRelatedInformation,
						com.tools20022.repository.msg.MandateRelatedInformation11.AmendmentInformationDetails, com.tools20022.repository.msg.Mandate11.Occurrences, com.tools20022.repository.msg.Mandate8.Occurrences,
						com.tools20022.repository.choice.OriginalMandate5Choice.OriginalMandate);
				superType_lazy = () -> Mandate.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.DirectDebitMandate.RelatedDirectDebit, com.tools20022.repository.entity.DirectDebitMandate.FinalCollectionDate,
						com.tools20022.repository.entity.DirectDebitMandate.Frequency, com.tools20022.repository.entity.DirectDebitMandate.FirstCollectionDate, com.tools20022.repository.entity.DirectDebitMandate.MandatePaymentType,
						com.tools20022.repository.entity.DirectDebitMandate.CollectionAmount, com.tools20022.repository.entity.DirectDebitMandate.MaximumAmount, com.tools20022.repository.entity.DirectDebitMandate.PreNotification,
						com.tools20022.repository.entity.DirectDebitMandate.PreNotificationThreshold, com.tools20022.repository.entity.DirectDebitMandate.Classification, com.tools20022.repository.entity.DirectDebitMandate.PointInTime);
				derivationComponent_lazy = () -> Arrays.asList(Mandate10.mmObject(), MandateAcceptance5.mmObject(), Mandate9.mmObject(), MandateRelatedInformation11.mmObject(), Mandate11.mmObject(), MandateAdjustment1.mmObject(),
						MandateOccurrences4.mmObject(), Mandate8.mmObject(), AmendmentInformationDetails11.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}