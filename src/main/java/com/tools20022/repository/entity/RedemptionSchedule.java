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
import com.tools20022.repository.codeset.*;
import com.tools20022.repository.datatype.Number;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Describes the reason and terms for early partial or total redemption,
 * amortisation or extension of an issue.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="RedemptionSchedule" src="doc-files/RedemptionSchedule.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RedemptionSchedule#BusinessDayConvention
 * RedemptionSchedule.BusinessDayConvention}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RedemptionSchedule#EffectivePeriod
 * RedemptionSchedule.EffectivePeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RedemptionSchedule#PriceChange
 * RedemptionSchedule.PriceChange}</li>
 * <li>{@linkplain com.tools20022.repository.entity.RedemptionSchedule#Price
 * RedemptionSchedule.Price}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RedemptionSchedule#PartyType
 * RedemptionSchedule.PartyType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RedemptionSchedule#AmountFulfilType
 * RedemptionSchedule.AmountFulfilType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RedemptionSchedule#MinimumNoticeDays
 * RedemptionSchedule.MinimumNoticeDays}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RedemptionSchedule#MaximumNoticeDays
 * RedemptionSchedule.MaximumNoticeDays}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RedemptionSchedule#FinancialCenter
 * RedemptionSchedule.FinancialCenter}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RedemptionSchedule#NoticePeriodType
 * RedemptionSchedule.NoticePeriodType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RedemptionSchedule#PriceChangeFrequency
 * RedemptionSchedule.PriceChangeFrequency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RedemptionSchedule#PriceFrequency
 * RedemptionSchedule.PriceFrequency}</li>
 * <li>{@linkplain com.tools20022.repository.entity.RedemptionSchedule#Security
 * RedemptionSchedule.Security}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Security#RedemptionSchedule
 * Security.RedemptionSchedule}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#PriceChangeRedemptionSchedule
 * SecuritiesPricing.PriceChangeRedemptionSchedule}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#RelatedRedemptionSchedule
 * SecuritiesPricing.RelatedRedemptionSchedule}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#RedemptionSchedule
 * DateTimePeriod.RedemptionSchedule}</li>
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
 * "RedemptionSchedule"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Describes the reason and terms for early partial or total redemption, amortisation or extension of an issue."
 * </li>
 * </ul>
 */
public class RedemptionSchedule {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Convention used for adjusting a date when it is not a business day.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.BusinessDayConventionCode
	 * BusinessDayConventionCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.RedemptionSchedule
	 * RedemptionSchedule}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BusinessDayConvention"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Convention used for adjusting a date when it is not a business day."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute BusinessDayConvention = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> RedemptionSchedule.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BusinessDayConvention";
			definition = "Convention used for adjusting a date when it is not a business day.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> BusinessDayConventionCode.mmObject();
		}
	};
	/**
	 * Period during which the issuer or holder may give notice.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#RedemptionSchedule
	 * DateTimePeriod.RedemptionSchedule}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.RedemptionSchedule
	 * RedemptionSchedule}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EffectivePeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Period during which the issuer or holder may give notice."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd EffectivePeriod = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> RedemptionSchedule.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "EffectivePeriod";
			definition = "Period during which the issuer or holder may give notice.";
			minOccurs = 0;
			type_lazy = () -> DateTimePeriod.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.RedemptionSchedule;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Redemption or amortisation price change.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#PriceChangeRedemptionSchedule
	 * SecuritiesPricing.PriceChangeRedemptionSchedule}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.RedemptionSchedule
	 * RedemptionSchedule}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PriceChange"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Redemption or amortisation price change."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd PriceChange = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> RedemptionSchedule.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PriceChange";
			definition = "Redemption or amortisation price change.";
			minOccurs = 0;
			type_lazy = () -> SecuritiesPricing.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.PriceChangeRedemptionSchedule;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Redemption or amortisation price.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#RelatedRedemptionSchedule
	 * SecuritiesPricing.RelatedRedemptionSchedule}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.RedemptionSchedule
	 * RedemptionSchedule}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Price"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Redemption or amortisation price."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Price = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> RedemptionSchedule.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Price";
			definition = "Redemption or amortisation price.";
			minOccurs = 0;
			type_lazy = () -> SecuritiesPricing.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.RelatedRedemptionSchedule;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Party type entitled to ask for the redemption.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.PartyTypeCode
	 * PartyTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.RedemptionSchedule
	 * RedemptionSchedule}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartyType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party type entitled to ask for the redemption."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute PartyType = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> RedemptionSchedule.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PartyType";
			definition = "Party type entitled to ask for the redemption.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> PartyTypeCode.mmObject();
		}
	};
	/**
	 * Specifies if the full amount or only part of it is redeemed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.AmountFullfilTypeCode
	 * AmountFullfilTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.RedemptionSchedule
	 * RedemptionSchedule}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AmountFulfilType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies if the full amount or only part of it is redeemed."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute AmountFulfilType = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> RedemptionSchedule.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AmountFulfilType";
			definition = "Specifies if the full amount or only part of it is redeemed.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> AmountFullfilTypeCode.mmObject();
		}
	};
	/**
	 * Minimum number of notice in days that must be given by either the issuer
	 * or the holder before redemption can take place.
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
	 * {@linkplain com.tools20022.repository.entity.RedemptionSchedule
	 * RedemptionSchedule}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MinimumNoticeDays"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Minimum number of notice in days that must be given by either the issuer or the holder before redemption can take place."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute MinimumNoticeDays = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> RedemptionSchedule.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MinimumNoticeDays";
			definition = "Minimum number of notice in days that must be given by either the issuer or the holder before redemption can take place.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	/**
	 * Maximum number of notice in days that must be given by either the issuer
	 * or the holder before redemption can take place.
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
	 * {@linkplain com.tools20022.repository.entity.RedemptionSchedule
	 * RedemptionSchedule}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaximumNoticeDays"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Maximum number of notice in days that must be given by either the issuer or the holder before redemption can take place."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute MaximumNoticeDays = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> RedemptionSchedule.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MaximumNoticeDays";
			definition = "Maximum number of notice in days that must be given by either the issuer or the holder before redemption can take place.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	/**
	 * Financial place taken into account to adjust the date and time, as
	 * defined within the business day convention.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialCenterCode
	 * FinancialCenterCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.RedemptionSchedule
	 * RedemptionSchedule}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialCenter"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Financial place  taken into account to adjust the date and time, as defined within the business day convention."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute FinancialCenter = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> RedemptionSchedule.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FinancialCenter";
			definition = "Financial place  taken into account to adjust the date and time, as defined within the business day convention.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> FinancialCenterCode.mmObject();
		}
	};
	/**
	 * Specifies the type of notice period.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.NoticePeriodTypeCode
	 * NoticePeriodTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.RedemptionSchedule
	 * RedemptionSchedule}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoticePeriodType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the type of notice period."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute NoticePeriodType = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> RedemptionSchedule.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NoticePeriodType";
			definition = "Specifies the type of notice period.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> NoticePeriodTypeCode.mmObject();
		}
	};
	/**
	 * Redemption or amortisation price change frequency.
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
	 * {@linkplain com.tools20022.repository.entity.RedemptionSchedule
	 * RedemptionSchedule}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PriceChangeFrequency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Redemption or amortisation price change frequency."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute PriceChangeFrequency = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> RedemptionSchedule.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PriceChangeFrequency";
			definition = "Redemption or amortisation price change frequency.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> FrequencyCode.mmObject();
		}
	};
	/**
	 * Specifies the frequency of the redemption.
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
	 * {@linkplain com.tools20022.repository.entity.RedemptionSchedule
	 * RedemptionSchedule}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PriceFrequency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the frequency of the redemption."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute PriceFrequency = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> RedemptionSchedule.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PriceFrequency";
			definition = "Specifies the frequency of the redemption.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> FrequencyCode.mmObject();
		}
	};
	/**
	 * Security for which a redemption schedule is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Security#RedemptionSchedule
	 * Security.RedemptionSchedule}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Security Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.RedemptionSchedule
	 * RedemptionSchedule}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Security"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Security for which a redemption schedule is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Security = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> RedemptionSchedule.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Security";
			definition = "Security for which a redemption schedule is specified.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Security.RedemptionSchedule;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "RedemptionSchedule";
				definition = "Describes the reason and terms for early partial or total redemption, amortisation or extension of an issue.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Security.RedemptionSchedule, com.tools20022.repository.entity.SecuritiesPricing.PriceChangeRedemptionSchedule,
						com.tools20022.repository.entity.SecuritiesPricing.RelatedRedemptionSchedule, com.tools20022.repository.entity.DateTimePeriod.RedemptionSchedule);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.RedemptionSchedule.BusinessDayConvention, com.tools20022.repository.entity.RedemptionSchedule.EffectivePeriod,
						com.tools20022.repository.entity.RedemptionSchedule.PriceChange, com.tools20022.repository.entity.RedemptionSchedule.Price, com.tools20022.repository.entity.RedemptionSchedule.PartyType,
						com.tools20022.repository.entity.RedemptionSchedule.AmountFulfilType, com.tools20022.repository.entity.RedemptionSchedule.MinimumNoticeDays, com.tools20022.repository.entity.RedemptionSchedule.MaximumNoticeDays,
						com.tools20022.repository.entity.RedemptionSchedule.FinancialCenter, com.tools20022.repository.entity.RedemptionSchedule.NoticePeriodType, com.tools20022.repository.entity.RedemptionSchedule.PriceChangeFrequency,
						com.tools20022.repository.entity.RedemptionSchedule.PriceFrequency, com.tools20022.repository.entity.RedemptionSchedule.Security);
			}
		});
		return mmObject_lazy.get();
	}
}