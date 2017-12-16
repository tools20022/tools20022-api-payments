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
import com.tools20022.repository.entity.Mandate;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.lang.reflect.Method;
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
 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference24#mmMandateRelatedInformation
 * OriginalTransactionReference24.mmMandateRelatedInformation}</li>
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
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
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
	 * Direct debit to which a mandate applies.
	 * <p>
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
	public static final MMBusinessAssociationEnd mmRelatedDirectDebit = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.DirectDebitMandate.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedDirectDebit";
			definition = "Direct debit to which a mandate applies.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.DirectDebit.mmDirectDebitMandate;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.DirectDebit.mmObject();
		}
	};
	protected ISODate finalCollectionDate;
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
	 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation11#mmFinalCollectionDate
	 * MandateRelatedInformation11.mmFinalCollectionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateOccurrences4#mmFinalCollectionDate
	 * MandateOccurrences4.mmFinalCollectionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails11#mmOriginalFinalCollectionDate
	 * AmendmentInformationDetails11.mmOriginalFinalCollectionDate}</li>
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
	public static final MMBusinessAttribute mmFinalCollectionDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(MandateRelatedInformation11.mmFinalCollectionDate, MandateOccurrences4.mmFinalCollectionDate, AmendmentInformationDetails11.mmOriginalFinalCollectionDate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.DirectDebitMandate.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FinalCollectionDate";
			definition = "Date of the final collection of a direct debit as per the mandate.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return DirectDebitMandate.class.getMethod("getFinalCollectionDate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected FrequencyCode frequency;
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
	public static final MMBusinessAttribute mmFrequency = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(MandateRelatedInformation11.mmFrequency, MandateAdjustment1.mmCategory, MandateOccurrences4.mmFrequency, AmendmentInformationDetails11.mmOriginalFrequency);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.DirectDebitMandate.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Frequency";
			definition = "Regularity with which direct debit instructions are to be created and processed.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> FrequencyCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return DirectDebitMandate.class.getMethod("getFrequency", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ISODate firstCollectionDate;
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
	 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation11#mmFirstCollectionDate
	 * MandateRelatedInformation11.mmFirstCollectionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateOccurrences4#mmFirstCollectionDate
	 * MandateOccurrences4.mmFirstCollectionDate}</li>
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
	public static final MMBusinessAttribute mmFirstCollectionDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(MandateRelatedInformation11.mmFirstCollectionDate, MandateOccurrences4.mmFirstCollectionDate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.DirectDebitMandate.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FirstCollectionDate";
			definition = "Date of the first collection of a direct debit as per the mandate.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return DirectDebitMandate.class.getMethod("getFirstCollectionDate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected PaymentProcessing mandatePaymentType;
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
	public static final MMBusinessAssociationEnd mmMandatePaymentType = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(Mandate10.mmType, MandateTypeInformation2.mmLocalInstrument, Mandate9.mmType, Mandate11.mmType, Mandate8.mmType);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.DirectDebitMandate.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MandatePaymentType";
			definition = "Set of elements that further identifies the type of mandate (service level and/or paper or electronic) being requested or given by the initiating party.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentProcessing.mmRelatedMandate;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.PaymentProcessing.mmObject();
		}
	};
	protected CurrencyAndAmount collectionAmount;
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
	public static final MMBusinessAttribute mmCollectionAmount = new MMBusinessAttribute() {
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

		public Method getGetterMethod() {
			try {
				return DirectDebitMandate.class.getMethod("getCollectionAmount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CurrencyAndAmount maximumAmount;
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
	public static final MMBusinessAttribute mmMaximumAmount = new MMBusinessAttribute() {
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

		public Method getGetterMethod() {
			try {
				return DirectDebitMandate.class.getMethod("getMaximumAmount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected TrueFalseIndicator preNotification;
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
	public static final MMBusinessAttribute mmPreNotification = new MMBusinessAttribute() {
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

		public Method getGetterMethod() {
			try {
				return DirectDebitMandate.class.getMethod("getPreNotification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Number preNotificationThreshold;
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
	public static final MMBusinessAttribute mmPreNotificationThreshold = new MMBusinessAttribute() {
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

		public Method getGetterMethod() {
			try {
				return DirectDebitMandate.class.getMethod("getPreNotificationThreshold", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected MandateClassificationCode classification;
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
	public static final MMBusinessAttribute mmClassification = new MMBusinessAttribute() {
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

		public Method getGetterMethod() {
			try {
				return DirectDebitMandate.class.getMethod("getClassification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected FrequencyCode pointInTime;
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
	public static final MMBusinessAttribute mmPointInTime = new MMBusinessAttribute() {
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

		public Method getGetterMethod() {
			try {
				return DirectDebitMandate.class.getMethod("getPointInTime", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DirectDebitMandate";
				definition = "Authorisation in favour of the creditor given by the debtor to debit its own account.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.DirectDebit.mmDirectDebitMandate, com.tools20022.repository.entity.PaymentProcessing.mmRelatedMandate);
				derivationElement_lazy = () -> Arrays.asList(Mandate10.mmOccurrences, MandateAmendment5.mmMandate, OriginalMandate4Choice.mmOriginalMandate, Mandate9.mmOccurrences,
						OriginalTransactionReference24.mmMandateRelatedInformation, MandateRelatedInformation11.mmAmendmentInformationDetails, Mandate11.mmOccurrences, Mandate8.mmOccurrences, OriginalMandate5Choice.mmOriginalMandate);
				superType_lazy = () -> Mandate.mmObject();
				element_lazy = () -> Arrays
						.asList(com.tools20022.repository.entity.DirectDebitMandate.mmRelatedDirectDebit, com.tools20022.repository.entity.DirectDebitMandate.mmFinalCollectionDate,
								com.tools20022.repository.entity.DirectDebitMandate.mmFrequency, com.tools20022.repository.entity.DirectDebitMandate.mmFirstCollectionDate,
								com.tools20022.repository.entity.DirectDebitMandate.mmMandatePaymentType, com.tools20022.repository.entity.DirectDebitMandate.mmCollectionAmount,
								com.tools20022.repository.entity.DirectDebitMandate.mmMaximumAmount, com.tools20022.repository.entity.DirectDebitMandate.mmPreNotification,
								com.tools20022.repository.entity.DirectDebitMandate.mmPreNotificationThreshold, com.tools20022.repository.entity.DirectDebitMandate.mmClassification,
								com.tools20022.repository.entity.DirectDebitMandate.mmPointInTime);
				derivationComponent_lazy = () -> Arrays.asList(Mandate10.mmObject(), MandateAcceptance5.mmObject(), Mandate9.mmObject(), MandateRelatedInformation11.mmObject(), Mandate11.mmObject(), MandateAdjustment1.mmObject(),
						MandateOccurrences4.mmObject(), Mandate8.mmObject(), AmendmentInformationDetails11.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return DirectDebitMandate.class;
			}
		});
		return mmObject_lazy.get();
	}

	public DirectDebit getRelatedDirectDebit() {
		return relatedDirectDebit;
	}

	public void setRelatedDirectDebit(com.tools20022.repository.entity.DirectDebit relatedDirectDebit) {
		this.relatedDirectDebit = relatedDirectDebit;
	}

	public ISODate getFinalCollectionDate() {
		return finalCollectionDate;
	}

	public void setFinalCollectionDate(ISODate finalCollectionDate) {
		this.finalCollectionDate = finalCollectionDate;
	}

	public FrequencyCode getFrequency() {
		return frequency;
	}

	public void setFrequency(FrequencyCode frequency) {
		this.frequency = frequency;
	}

	public ISODate getFirstCollectionDate() {
		return firstCollectionDate;
	}

	public void setFirstCollectionDate(ISODate firstCollectionDate) {
		this.firstCollectionDate = firstCollectionDate;
	}

	public PaymentProcessing getMandatePaymentType() {
		return mandatePaymentType;
	}

	public void setMandatePaymentType(com.tools20022.repository.entity.PaymentProcessing mandatePaymentType) {
		this.mandatePaymentType = mandatePaymentType;
	}

	public CurrencyAndAmount getCollectionAmount() {
		return collectionAmount;
	}

	public void setCollectionAmount(CurrencyAndAmount collectionAmount) {
		this.collectionAmount = collectionAmount;
	}

	public CurrencyAndAmount getMaximumAmount() {
		return maximumAmount;
	}

	public void setMaximumAmount(CurrencyAndAmount maximumAmount) {
		this.maximumAmount = maximumAmount;
	}

	public TrueFalseIndicator getPreNotification() {
		return preNotification;
	}

	public void setPreNotification(TrueFalseIndicator preNotification) {
		this.preNotification = preNotification;
	}

	public Number getPreNotificationThreshold() {
		return preNotificationThreshold;
	}

	public void setPreNotificationThreshold(Number preNotificationThreshold) {
		this.preNotificationThreshold = preNotificationThreshold;
	}

	public MandateClassificationCode getClassification() {
		return classification;
	}

	public void setClassification(MandateClassificationCode classification) {
		this.classification = classification;
	}

	public FrequencyCode getPointInTime() {
		return pointInTime;
	}

	public void setPointInTime(FrequencyCode pointInTime) {
		this.pointInTime = pointInTime;
	}
}