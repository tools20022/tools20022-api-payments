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
import com.tools20022.repository.codeset.FrequencyCode;
import com.tools20022.repository.codeset.MandateClassificationCode;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.datatype.TrueFalseIndicator;
import com.tools20022.repository.entity.DirectDebit;
import com.tools20022.repository.entity.Mandate;
import com.tools20022.repository.entity.PaymentProcessing;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;

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
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Mandate Mandate}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DirectDebitMandate#mmRelatedDirectDebit
 * DirectDebitMandate.mmRelatedDirectDebit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DirectDebitMandate#mmFinalCollectionDate
 * DirectDebitMandate.mmFinalCollectionDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DirectDebitMandate#mmFrequency
 * DirectDebitMandate.mmFrequency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DirectDebitMandate#mmFirstCollectionDate
 * DirectDebitMandate.mmFirstCollectionDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DirectDebitMandate#mmMandatePaymentType
 * DirectDebitMandate.mmMandatePaymentType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DirectDebitMandate#mmCollectionAmount
 * DirectDebitMandate.mmCollectionAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DirectDebitMandate#mmMaximumAmount
 * DirectDebitMandate.mmMaximumAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DirectDebitMandate#mmPreNotification
 * DirectDebitMandate.mmPreNotification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DirectDebitMandate#mmPreNotificationThreshold
 * DirectDebitMandate.mmPreNotificationThreshold}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DirectDebitMandate#mmClassification
 * DirectDebitMandate.mmClassification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DirectDebitMandate#mmPointInTime
 * DirectDebitMandate.mmPointInTime}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DirectDebit#mmDirectDebitMandate
 * DirectDebit.mmDirectDebitMandate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentProcessing#mmRelatedMandate
 * PaymentProcessing.mmRelatedMandate}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Mandate10#mmOccurrences
 * Mandate10.mmOccurrences}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MandateAmendment5#mmMandate
 * MandateAmendment5.mmMandate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.OriginalMandate4Choice#mmOriginalMandate
 * OriginalMandate4Choice.mmOriginalMandate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Mandate9#mmOccurrences
 * Mandate9.mmOccurrences}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation11#mmAmendmentInformationDetails
 * MandateRelatedInformation11.mmAmendmentInformationDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Mandate11#mmOccurrences
 * Mandate11.mmOccurrences}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Mandate8#mmOccurrences
 * Mandate8.mmOccurrences}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.OriginalMandate5Choice#mmOriginalMandate
 * OriginalMandate5Choice.mmOriginalMandate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference27#mmMandateRelatedInformation
 * OriginalTransactionReference27.mmMandateRelatedInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation12#mmAmendmentInformationDetails
 * MandateRelatedInformation12.mmAmendmentInformationDetails}</li>
 * </ul>
 * </li>
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
 * <li>{@linkplain com.tools20022.repository.msg.MandateRelatedInformation12
 * MandateRelatedInformation12}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AmendmentInformationDetails12
 * AmendmentInformationDetails12}</li>
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
	protected DirectDebit relatedDirectDebit;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DirectDebit#mmDirectDebitMandate
	 * DirectDebit.mmDirectDebitMandate}</li>
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
	public static final MMBusinessAssociationEnd<DirectDebitMandate, Optional<DirectDebit>> mmRelatedDirectDebit = new MMBusinessAssociationEnd<DirectDebitMandate, Optional<DirectDebit>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.DirectDebitMandate.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedDirectDebit";
			definition = "Direct debit to which a mandate applies.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> DirectDebit.mmDirectDebitMandate;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> DirectDebit.mmObject();
		}

		@Override
		public Optional<DirectDebit> getValue(DirectDebitMandate obj) {
			return obj.getRelatedDirectDebit();
		}

		@Override
		public void setValue(DirectDebitMandate obj, Optional<DirectDebit> value) {
			obj.setRelatedDirectDebit(value.orElse(null));
		}
	};
	protected ISODate finalCollectionDate;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation11#mmFinalCollectionDate
	 * MandateRelatedInformation11.mmFinalCollectionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateOccurrences4#mmFinalCollectionDate
	 * MandateOccurrences4.mmFinalCollectionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails11#mmOriginalFinalCollectionDate
	 * AmendmentInformationDetails11.mmOriginalFinalCollectionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation12#mmFinalCollectionDate
	 * MandateRelatedInformation12.mmFinalCollectionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails12#mmOriginalFinalCollectionDate
	 * AmendmentInformationDetails12.mmOriginalFinalCollectionDate}</li>
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
	public static final MMBusinessAttribute<DirectDebitMandate, ISODate> mmFinalCollectionDate = new MMBusinessAttribute<DirectDebitMandate, ISODate>() {
		{
			derivation_lazy = () -> Arrays.asList(MandateRelatedInformation11.mmFinalCollectionDate, MandateOccurrences4.mmFinalCollectionDate, AmendmentInformationDetails11.mmOriginalFinalCollectionDate,
					MandateRelatedInformation12.mmFinalCollectionDate, AmendmentInformationDetails12.mmOriginalFinalCollectionDate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.DirectDebitMandate.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FinalCollectionDate";
			definition = "Date of the final collection of a direct debit as per the mandate.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public ISODate getValue(DirectDebitMandate obj) {
			return obj.getFinalCollectionDate();
		}

		@Override
		public void setValue(DirectDebitMandate obj, ISODate value) {
			obj.setFinalCollectionDate(value);
		}
	};
	protected FrequencyCode frequency;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation11#mmFrequency
	 * MandateRelatedInformation11.mmFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateAdjustment1#mmCategory
	 * MandateAdjustment1.mmCategory}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateOccurrences4#mmFrequency
	 * MandateOccurrences4.mmFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails11#mmOriginalFrequency
	 * AmendmentInformationDetails11.mmOriginalFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation12#mmFrequency
	 * MandateRelatedInformation12.mmFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails12#mmOriginalFrequency
	 * AmendmentInformationDetails12.mmOriginalFrequency}</li>
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
	public static final MMBusinessAttribute<DirectDebitMandate, FrequencyCode> mmFrequency = new MMBusinessAttribute<DirectDebitMandate, FrequencyCode>() {
		{
			derivation_lazy = () -> Arrays.asList(MandateRelatedInformation11.mmFrequency, MandateAdjustment1.mmCategory, MandateOccurrences4.mmFrequency, AmendmentInformationDetails11.mmOriginalFrequency,
					MandateRelatedInformation12.mmFrequency, AmendmentInformationDetails12.mmOriginalFrequency);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.DirectDebitMandate.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Frequency";
			definition = "Regularity with which direct debit instructions are to be created and processed.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> FrequencyCode.mmObject();
		}

		@Override
		public FrequencyCode getValue(DirectDebitMandate obj) {
			return obj.getFrequency();
		}

		@Override
		public void setValue(DirectDebitMandate obj, FrequencyCode value) {
			obj.setFrequency(value);
		}
	};
	protected ISODate firstCollectionDate;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation11#mmFirstCollectionDate
	 * MandateRelatedInformation11.mmFirstCollectionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateOccurrences4#mmFirstCollectionDate
	 * MandateOccurrences4.mmFirstCollectionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation12#mmFirstCollectionDate
	 * MandateRelatedInformation12.mmFirstCollectionDate}</li>
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
	public static final MMBusinessAttribute<DirectDebitMandate, ISODate> mmFirstCollectionDate = new MMBusinessAttribute<DirectDebitMandate, ISODate>() {
		{
			derivation_lazy = () -> Arrays.asList(MandateRelatedInformation11.mmFirstCollectionDate, MandateOccurrences4.mmFirstCollectionDate, MandateRelatedInformation12.mmFirstCollectionDate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.DirectDebitMandate.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FirstCollectionDate";
			definition = "Date of the first collection of a direct debit as per the mandate.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public ISODate getValue(DirectDebitMandate obj) {
			return obj.getFirstCollectionDate();
		}

		@Override
		public void setValue(DirectDebitMandate obj, ISODate value) {
			obj.setFirstCollectionDate(value);
		}
	};
	protected PaymentProcessing mandatePaymentType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PaymentProcessing#mmRelatedMandate
	 * PaymentProcessing.mmRelatedMandate}</li>
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
	 * <li>{@linkplain com.tools20022.repository.msg.Mandate10#mmType
	 * Mandate10.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateTypeInformation2#mmLocalInstrument
	 * MandateTypeInformation2.mmLocalInstrument}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Mandate9#mmType
	 * Mandate9.mmType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Mandate11#mmType
	 * Mandate11.mmType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Mandate8#mmType
	 * Mandate8.mmType}</li>
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
	public static final MMBusinessAssociationEnd<DirectDebitMandate, PaymentProcessing> mmMandatePaymentType = new MMBusinessAssociationEnd<DirectDebitMandate, PaymentProcessing>() {
		{
			derivation_lazy = () -> Arrays.asList(Mandate10.mmType, MandateTypeInformation2.mmLocalInstrument, Mandate9.mmType, Mandate11.mmType, Mandate8.mmType);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.DirectDebitMandate.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MandatePaymentType";
			definition = "Set of elements that further identifies the type of mandate (service level and/or paper or electronic) being requested or given by the initiating party.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> PaymentProcessing.mmRelatedMandate;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> PaymentProcessing.mmObject();
		}

		@Override
		public PaymentProcessing getValue(DirectDebitMandate obj) {
			return obj.getMandatePaymentType();
		}

		@Override
		public void setValue(DirectDebitMandate obj, PaymentProcessing value) {
			obj.setMandatePaymentType(value);
		}
	};
	protected CurrencyAndAmount collectionAmount;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.Mandate10#mmFirstCollectionAmount
	 * Mandate10.mmFirstCollectionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Mandate10#mmCollectionAmount
	 * Mandate10.mmCollectionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Mandate9#mmFirstCollectionAmount
	 * Mandate9.mmFirstCollectionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Mandate9#mmCollectionAmount
	 * Mandate9.mmCollectionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Mandate11#mmFirstCollectionAmount
	 * Mandate11.mmFirstCollectionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Mandate11#mmCollectionAmount
	 * Mandate11.mmCollectionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateAdjustment1#mmAmount
	 * MandateAdjustment1.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Mandate8#mmFirstCollectionAmount
	 * Mandate8.mmFirstCollectionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Mandate8#mmCollectionAmount
	 * Mandate8.mmCollectionAmount}</li>
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
	public static final MMBusinessAttribute<DirectDebitMandate, CurrencyAndAmount> mmCollectionAmount = new MMBusinessAttribute<DirectDebitMandate, CurrencyAndAmount>() {
		{
			derivation_lazy = () -> Arrays.asList(Mandate10.mmFirstCollectionAmount, Mandate10.mmCollectionAmount, Mandate9.mmFirstCollectionAmount, Mandate9.mmCollectionAmount, Mandate11.mmFirstCollectionAmount,
					Mandate11.mmCollectionAmount, MandateAdjustment1.mmAmount, Mandate8.mmFirstCollectionAmount, Mandate8.mmCollectionAmount);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.DirectDebitMandate.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CollectionAmount";
			definition = "Fixed amount that the debtor has agreed will be collected from their account.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		@Override
		public CurrencyAndAmount getValue(DirectDebitMandate obj) {
			return obj.getCollectionAmount();
		}

		@Override
		public void setValue(DirectDebitMandate obj, CurrencyAndAmount value) {
			obj.setCollectionAmount(value);
		}
	};
	protected CurrencyAndAmount maximumAmount;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.repository.msg.Mandate10#mmMaximumAmount
	 * Mandate10.mmMaximumAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Mandate9#mmMaximumAmount
	 * Mandate9.mmMaximumAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Mandate11#mmMaximumAmount
	 * Mandate11.mmMaximumAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Mandate8#mmMaximumAmount
	 * Mandate8.mmMaximumAmount}</li>
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
	public static final MMBusinessAttribute<DirectDebitMandate, CurrencyAndAmount> mmMaximumAmount = new MMBusinessAttribute<DirectDebitMandate, CurrencyAndAmount>() {
		{
			derivation_lazy = () -> Arrays.asList(Mandate10.mmMaximumAmount, Mandate9.mmMaximumAmount, Mandate11.mmMaximumAmount, Mandate8.mmMaximumAmount);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.DirectDebitMandate.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MaximumAmount";
			definition = "Maximum amount that may be collected from the debtor's account, per instruction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		@Override
		public CurrencyAndAmount getValue(DirectDebitMandate obj) {
			return obj.getMaximumAmount();
		}

		@Override
		public void setValue(DirectDebitMandate obj, CurrencyAndAmount value) {
			obj.setMaximumAmount(value);
		}
	};
	protected TrueFalseIndicator preNotification;
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
	public static final MMBusinessAttribute<DirectDebitMandate, TrueFalseIndicator> mmPreNotification = new MMBusinessAttribute<DirectDebitMandate, TrueFalseIndicator>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.DirectDebitMandate.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PreNotification";
			definition = "Indicates wether a pre-notification must be sent by the creditor to the debtor before a direct debit occurs";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}

		@Override
		public TrueFalseIndicator getValue(DirectDebitMandate obj) {
			return obj.getPreNotification();
		}

		@Override
		public void setValue(DirectDebitMandate obj, TrueFalseIndicator value) {
			obj.setPreNotification(value);
		}
	};
	protected Number preNotificationThreshold;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute<DirectDebitMandate, Number> mmPreNotificationThreshold = new MMBusinessAttribute<DirectDebitMandate, Number>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.DirectDebitMandate.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PreNotificationThreshold";
			definition = "Specifies the number of days before the direct debit for notifying the debtor.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}

		@Override
		public Number getValue(DirectDebitMandate obj) {
			return obj.getPreNotificationThreshold();
		}

		@Override
		public void setValue(DirectDebitMandate obj, Number value) {
			obj.setPreNotificationThreshold(value);
		}
	};
	protected MandateClassificationCode classification;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.MandateTypeInformation2#mmClassification
	 * MandateTypeInformation2.mmClassification}</li>
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
	public static final MMBusinessAttribute<DirectDebitMandate, MandateClassificationCode> mmClassification = new MMBusinessAttribute<DirectDebitMandate, MandateClassificationCode>() {
		{
			derivation_lazy = () -> Arrays.asList(MandateTypeInformation2.mmClassification);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.DirectDebitMandate.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Classification";
			definition = "Type of direct debit instruction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> MandateClassificationCode.mmObject();
		}

		@Override
		public MandateClassificationCode getValue(DirectDebitMandate obj) {
			return obj.getClassification();
		}

		@Override
		public void setValue(DirectDebitMandate obj, MandateClassificationCode value) {
			obj.setClassification(value);
		}
	};
	protected FrequencyCode pointInTime;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute<DirectDebitMandate, FrequencyCode> mmPointInTime = new MMBusinessAttribute<DirectDebitMandate, FrequencyCode>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.DirectDebitMandate.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PointInTime";
			definition = "Specifies a frequency in terms of an exact point in time or moment within a specified period type.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> FrequencyCode.mmObject();
		}

		@Override
		public FrequencyCode getValue(DirectDebitMandate obj) {
			return obj.getPointInTime();
		}

		@Override
		public void setValue(DirectDebitMandate obj, FrequencyCode value) {
			obj.setPointInTime(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DirectDebitMandate";
				definition = "Authorisation in favour of the creditor given by the debtor to debit its own account.";
				associationDomain_lazy = () -> Arrays.asList(DirectDebit.mmDirectDebitMandate, PaymentProcessing.mmRelatedMandate);
				derivationElement_lazy = () -> Arrays.asList(Mandate10.mmOccurrences, MandateAmendment5.mmMandate, OriginalMandate4Choice.mmOriginalMandate, Mandate9.mmOccurrences, MandateRelatedInformation11.mmAmendmentInformationDetails,
						Mandate11.mmOccurrences, Mandate8.mmOccurrences, OriginalMandate5Choice.mmOriginalMandate, OriginalTransactionReference27.mmMandateRelatedInformation, MandateRelatedInformation12.mmAmendmentInformationDetails);
				superType_lazy = () -> Mandate.mmObject();
				element_lazy = () -> Arrays
						.asList(com.tools20022.repository.entity.DirectDebitMandate.mmRelatedDirectDebit, com.tools20022.repository.entity.DirectDebitMandate.mmFinalCollectionDate,
								com.tools20022.repository.entity.DirectDebitMandate.mmFrequency, com.tools20022.repository.entity.DirectDebitMandate.mmFirstCollectionDate,
								com.tools20022.repository.entity.DirectDebitMandate.mmMandatePaymentType, com.tools20022.repository.entity.DirectDebitMandate.mmCollectionAmount,
								com.tools20022.repository.entity.DirectDebitMandate.mmMaximumAmount, com.tools20022.repository.entity.DirectDebitMandate.mmPreNotification,
								com.tools20022.repository.entity.DirectDebitMandate.mmPreNotificationThreshold, com.tools20022.repository.entity.DirectDebitMandate.mmClassification,
								com.tools20022.repository.entity.DirectDebitMandate.mmPointInTime);
				derivationComponent_lazy = () -> Arrays.asList(Mandate10.mmObject(), MandateAcceptance5.mmObject(), Mandate9.mmObject(), MandateRelatedInformation11.mmObject(), Mandate11.mmObject(), MandateAdjustment1.mmObject(),
						MandateOccurrences4.mmObject(), Mandate8.mmObject(), AmendmentInformationDetails11.mmObject(), MandateRelatedInformation12.mmObject(), AmendmentInformationDetails12.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return DirectDebitMandate.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<DirectDebit> getRelatedDirectDebit() {
		return relatedDirectDebit == null ? Optional.empty() : Optional.of(relatedDirectDebit);
	}

	public DirectDebitMandate setRelatedDirectDebit(DirectDebit relatedDirectDebit) {
		this.relatedDirectDebit = relatedDirectDebit;
		return this;
	}

	public ISODate getFinalCollectionDate() {
		return finalCollectionDate;
	}

	public DirectDebitMandate setFinalCollectionDate(ISODate finalCollectionDate) {
		this.finalCollectionDate = Objects.requireNonNull(finalCollectionDate);
		return this;
	}

	public FrequencyCode getFrequency() {
		return frequency;
	}

	public DirectDebitMandate setFrequency(FrequencyCode frequency) {
		this.frequency = Objects.requireNonNull(frequency);
		return this;
	}

	public ISODate getFirstCollectionDate() {
		return firstCollectionDate;
	}

	public DirectDebitMandate setFirstCollectionDate(ISODate firstCollectionDate) {
		this.firstCollectionDate = Objects.requireNonNull(firstCollectionDate);
		return this;
	}

	public PaymentProcessing getMandatePaymentType() {
		return mandatePaymentType;
	}

	public DirectDebitMandate setMandatePaymentType(PaymentProcessing mandatePaymentType) {
		this.mandatePaymentType = Objects.requireNonNull(mandatePaymentType);
		return this;
	}

	public CurrencyAndAmount getCollectionAmount() {
		return collectionAmount;
	}

	public DirectDebitMandate setCollectionAmount(CurrencyAndAmount collectionAmount) {
		this.collectionAmount = Objects.requireNonNull(collectionAmount);
		return this;
	}

	public CurrencyAndAmount getMaximumAmount() {
		return maximumAmount;
	}

	public DirectDebitMandate setMaximumAmount(CurrencyAndAmount maximumAmount) {
		this.maximumAmount = Objects.requireNonNull(maximumAmount);
		return this;
	}

	public TrueFalseIndicator getPreNotification() {
		return preNotification;
	}

	public DirectDebitMandate setPreNotification(TrueFalseIndicator preNotification) {
		this.preNotification = Objects.requireNonNull(preNotification);
		return this;
	}

	public Number getPreNotificationThreshold() {
		return preNotificationThreshold;
	}

	public DirectDebitMandate setPreNotificationThreshold(Number preNotificationThreshold) {
		this.preNotificationThreshold = Objects.requireNonNull(preNotificationThreshold);
		return this;
	}

	public MandateClassificationCode getClassification() {
		return classification;
	}

	public DirectDebitMandate setClassification(MandateClassificationCode classification) {
		this.classification = Objects.requireNonNull(classification);
		return this;
	}

	public FrequencyCode getPointInTime() {
		return pointInTime;
	}

	public DirectDebitMandate setPointInTime(FrequencyCode pointInTime) {
		this.pointInTime = Objects.requireNonNull(pointInTime);
		return this;
	}
}