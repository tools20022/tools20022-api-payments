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
import com.tools20022.repository.codeset.*;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.GeneratedRepository;
import java.lang.reflect.Method;
import java.util.*;
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
 * {@linkplain com.tools20022.repository.entity.RedemptionSchedule#mmBusinessDayConvention
 * RedemptionSchedule.mmBusinessDayConvention}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RedemptionSchedule#mmEffectivePeriod
 * RedemptionSchedule.mmEffectivePeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RedemptionSchedule#mmPriceChange
 * RedemptionSchedule.mmPriceChange}</li>
 * <li>{@linkplain com.tools20022.repository.entity.RedemptionSchedule#mmPrice
 * RedemptionSchedule.mmPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RedemptionSchedule#mmPartyType
 * RedemptionSchedule.mmPartyType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RedemptionSchedule#mmAmountFulfilType
 * RedemptionSchedule.mmAmountFulfilType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RedemptionSchedule#mmMinimumNoticeDays
 * RedemptionSchedule.mmMinimumNoticeDays}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RedemptionSchedule#mmMaximumNoticeDays
 * RedemptionSchedule.mmMaximumNoticeDays}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RedemptionSchedule#mmFinancialCenter
 * RedemptionSchedule.mmFinancialCenter}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RedemptionSchedule#mmNoticePeriodType
 * RedemptionSchedule.mmNoticePeriodType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RedemptionSchedule#mmPriceChangeFrequency
 * RedemptionSchedule.mmPriceChangeFrequency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RedemptionSchedule#mmPriceFrequency
 * RedemptionSchedule.mmPriceFrequency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RedemptionSchedule#mmSecurity
 * RedemptionSchedule.mmSecurity}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Security#mmRedemptionSchedule
 * Security.mmRedemptionSchedule}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmPriceChangeRedemptionSchedule
 * SecuritiesPricing.mmPriceChangeRedemptionSchedule}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmRelatedRedemptionSchedule
 * SecuritiesPricing.mmRelatedRedemptionSchedule}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmRedemptionSchedule
 * DateTimePeriod.mmRedemptionSchedule}</li>
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
	protected BusinessDayConventionCode businessDayConvention;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute mmBusinessDayConvention = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.RedemptionSchedule.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BusinessDayConvention";
			definition = "Convention used for adjusting a date when it is not a business day.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> BusinessDayConventionCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return RedemptionSchedule.class.getMethod("getBusinessDayConvention", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.DateTimePeriod> effectivePeriod;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmRedemptionSchedule
	 * DateTimePeriod.mmRedemptionSchedule}</li>
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
	public static final MMBusinessAssociationEnd mmEffectivePeriod = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.RedemptionSchedule.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "EffectivePeriod";
			definition = "Period during which the issuer or holder may give notice.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmRedemptionSchedule;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.SecuritiesPricing> priceChange;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmPriceChangeRedemptionSchedule
	 * SecuritiesPricing.mmPriceChangeRedemptionSchedule}</li>
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
	public static final MMBusinessAssociationEnd mmPriceChange = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.RedemptionSchedule.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PriceChange";
			definition = "Redemption or amortisation price change.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmPriceChangeRedemptionSchedule;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.SecuritiesPricing> price;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmRelatedRedemptionSchedule
	 * SecuritiesPricing.mmRelatedRedemptionSchedule}</li>
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
	public static final MMBusinessAssociationEnd mmPrice = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.RedemptionSchedule.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Price";
			definition = "Redemption or amortisation price.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmRelatedRedemptionSchedule;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
		}
	};
	protected PartyTypeCode partyType;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute mmPartyType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.RedemptionSchedule.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PartyType";
			definition = "Party type entitled to ask for the redemption.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PartyTypeCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return RedemptionSchedule.class.getMethod("getPartyType", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected AmountFullfilTypeCode amountFulfilType;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute mmAmountFulfilType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.RedemptionSchedule.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AmountFulfilType";
			definition = "Specifies if the full amount or only part of it is redeemed.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> AmountFullfilTypeCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return RedemptionSchedule.class.getMethod("getAmountFulfilType", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Number minimumNoticeDays;
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
	public static final MMBusinessAttribute mmMinimumNoticeDays = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.RedemptionSchedule.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MinimumNoticeDays";
			definition = "Minimum number of notice in days that must be given by either the issuer or the holder before redemption can take place.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return RedemptionSchedule.class.getMethod("getMinimumNoticeDays", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Number maximumNoticeDays;
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
	public static final MMBusinessAttribute mmMaximumNoticeDays = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.RedemptionSchedule.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MaximumNoticeDays";
			definition = "Maximum number of notice in days that must be given by either the issuer or the holder before redemption can take place.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return RedemptionSchedule.class.getMethod("getMaximumNoticeDays", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected FinancialCenterCode financialCenter;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute mmFinancialCenter = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.RedemptionSchedule.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FinancialCenter";
			definition = "Financial place  taken into account to adjust the date and time, as defined within the business day convention.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> FinancialCenterCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return RedemptionSchedule.class.getMethod("getFinancialCenter", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected NoticePeriodTypeCode noticePeriodType;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute mmNoticePeriodType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.RedemptionSchedule.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NoticePeriodType";
			definition = "Specifies the type of notice period.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> NoticePeriodTypeCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return RedemptionSchedule.class.getMethod("getNoticePeriodType", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected FrequencyCode priceChangeFrequency;
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
	public static final MMBusinessAttribute mmPriceChangeFrequency = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.RedemptionSchedule.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PriceChangeFrequency";
			definition = "Redemption or amortisation price change frequency.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> FrequencyCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return RedemptionSchedule.class.getMethod("getPriceChangeFrequency", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected FrequencyCode priceFrequency;
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
	public static final MMBusinessAttribute mmPriceFrequency = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.RedemptionSchedule.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PriceFrequency";
			definition = "Specifies the frequency of the redemption.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> FrequencyCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return RedemptionSchedule.class.getMethod("getPriceFrequency", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Security security;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmRedemptionSchedule
	 * Security.mmRedemptionSchedule}</li>
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
	public static final MMBusinessAssociationEnd mmSecurity = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.RedemptionSchedule.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Security";
			definition = "Security for which a redemption schedule is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Security.mmRedemptionSchedule;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "RedemptionSchedule";
				definition = "Describes the reason and terms for early partial or total redemption, amortisation or extension of an issue.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Security.mmRedemptionSchedule, com.tools20022.repository.entity.SecuritiesPricing.mmPriceChangeRedemptionSchedule,
						com.tools20022.repository.entity.SecuritiesPricing.mmRelatedRedemptionSchedule, com.tools20022.repository.entity.DateTimePeriod.mmRedemptionSchedule);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.RedemptionSchedule.mmBusinessDayConvention, com.tools20022.repository.entity.RedemptionSchedule.mmEffectivePeriod,
						com.tools20022.repository.entity.RedemptionSchedule.mmPriceChange, com.tools20022.repository.entity.RedemptionSchedule.mmPrice, com.tools20022.repository.entity.RedemptionSchedule.mmPartyType,
						com.tools20022.repository.entity.RedemptionSchedule.mmAmountFulfilType, com.tools20022.repository.entity.RedemptionSchedule.mmMinimumNoticeDays,
						com.tools20022.repository.entity.RedemptionSchedule.mmMaximumNoticeDays, com.tools20022.repository.entity.RedemptionSchedule.mmFinancialCenter, com.tools20022.repository.entity.RedemptionSchedule.mmNoticePeriodType,
						com.tools20022.repository.entity.RedemptionSchedule.mmPriceChangeFrequency, com.tools20022.repository.entity.RedemptionSchedule.mmPriceFrequency, com.tools20022.repository.entity.RedemptionSchedule.mmSecurity);
			}

			@Override
			public Class<?> getInstanceClass() {
				return RedemptionSchedule.class;
			}
		});
		return mmObject_lazy.get();
	}

	public BusinessDayConventionCode getBusinessDayConvention() {
		return businessDayConvention;
	}

	public RedemptionSchedule setBusinessDayConvention(BusinessDayConventionCode businessDayConvention) {
		this.businessDayConvention = Objects.requireNonNull(businessDayConvention);
		return this;
	}

	public List<DateTimePeriod> getEffectivePeriod() {
		return effectivePeriod == null ? effectivePeriod = new ArrayList<>() : effectivePeriod;
	}

	public RedemptionSchedule setEffectivePeriod(List<com.tools20022.repository.entity.DateTimePeriod> effectivePeriod) {
		this.effectivePeriod = Objects.requireNonNull(effectivePeriod);
		return this;
	}

	public List<SecuritiesPricing> getPriceChange() {
		return priceChange == null ? priceChange = new ArrayList<>() : priceChange;
	}

	public RedemptionSchedule setPriceChange(List<com.tools20022.repository.entity.SecuritiesPricing> priceChange) {
		this.priceChange = Objects.requireNonNull(priceChange);
		return this;
	}

	public List<SecuritiesPricing> getPrice() {
		return price == null ? price = new ArrayList<>() : price;
	}

	public RedemptionSchedule setPrice(List<com.tools20022.repository.entity.SecuritiesPricing> price) {
		this.price = Objects.requireNonNull(price);
		return this;
	}

	public PartyTypeCode getPartyType() {
		return partyType;
	}

	public RedemptionSchedule setPartyType(PartyTypeCode partyType) {
		this.partyType = Objects.requireNonNull(partyType);
		return this;
	}

	public AmountFullfilTypeCode getAmountFulfilType() {
		return amountFulfilType;
	}

	public RedemptionSchedule setAmountFulfilType(AmountFullfilTypeCode amountFulfilType) {
		this.amountFulfilType = Objects.requireNonNull(amountFulfilType);
		return this;
	}

	public Number getMinimumNoticeDays() {
		return minimumNoticeDays;
	}

	public RedemptionSchedule setMinimumNoticeDays(Number minimumNoticeDays) {
		this.minimumNoticeDays = Objects.requireNonNull(minimumNoticeDays);
		return this;
	}

	public Number getMaximumNoticeDays() {
		return maximumNoticeDays;
	}

	public RedemptionSchedule setMaximumNoticeDays(Number maximumNoticeDays) {
		this.maximumNoticeDays = Objects.requireNonNull(maximumNoticeDays);
		return this;
	}

	public FinancialCenterCode getFinancialCenter() {
		return financialCenter;
	}

	public RedemptionSchedule setFinancialCenter(FinancialCenterCode financialCenter) {
		this.financialCenter = Objects.requireNonNull(financialCenter);
		return this;
	}

	public NoticePeriodTypeCode getNoticePeriodType() {
		return noticePeriodType;
	}

	public RedemptionSchedule setNoticePeriodType(NoticePeriodTypeCode noticePeriodType) {
		this.noticePeriodType = Objects.requireNonNull(noticePeriodType);
		return this;
	}

	public FrequencyCode getPriceChangeFrequency() {
		return priceChangeFrequency;
	}

	public RedemptionSchedule setPriceChangeFrequency(FrequencyCode priceChangeFrequency) {
		this.priceChangeFrequency = Objects.requireNonNull(priceChangeFrequency);
		return this;
	}

	public FrequencyCode getPriceFrequency() {
		return priceFrequency;
	}

	public RedemptionSchedule setPriceFrequency(FrequencyCode priceFrequency) {
		this.priceFrequency = Objects.requireNonNull(priceFrequency);
		return this;
	}

	public Optional<Security> getSecurity() {
		return security == null ? Optional.empty() : Optional.of(security);
	}

	public RedemptionSchedule setSecurity(com.tools20022.repository.entity.Security security) {
		this.security = security;
		return this;
	}
}