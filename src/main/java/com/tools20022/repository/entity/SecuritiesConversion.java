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
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.LoanContract1;
import java.lang.reflect.Method;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Conversion exchange of securities, generally convertible bonds or preferred
 * equities, into another form of securities, usually common equities.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="SecuritiesConversion" src="doc-files/SecuritiesConversion.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion#mmConversionPrice
 * SecuritiesConversion.mmConversionPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion#mmConversionDate
 * SecuritiesConversion.mmConversionDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion#mmMinimumExercisableQuantity
 * SecuritiesConversion.mmMinimumExercisableQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion#mmMinimumExercisableMultipleQuantity
 * SecuritiesConversion.mmMinimumExercisableMultipleQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion#mmMaximumExercisableQuantity
 * SecuritiesConversion.mmMaximumExercisableQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion#mmConversionType
 * SecuritiesConversion.mmConversionType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion#mmConversionPeriod
 * SecuritiesConversion.mmConversionPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion#mmConversionRatioDenominator
 * SecuritiesConversion.mmConversionRatioDenominator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion#mmConversionRatioNumerator
 * SecuritiesConversion.mmConversionRatioNumerator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion#mmRatio
 * SecuritiesConversion.mmRatio}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion#mmConversionUnitCurrency
 * SecuritiesConversion.mmConversionUnitCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion#mmRelatedOption
 * SecuritiesConversion.mmRelatedOption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion#mmBusinessDayConvention
 * SecuritiesConversion.mmBusinessDayConvention}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion#mmConversionChoice
 * SecuritiesConversion.mmConversionChoice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion#mmConversionFixedExchangeRate
 * SecuritiesConversion.mmConversionFixedExchangeRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion#mmConversionMarginAmount
 * SecuritiesConversion.mmConversionMarginAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion#mmConversionOption
 * SecuritiesConversion.mmConversionOption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion#mmConversionQuotedCurrency
 * SecuritiesConversion.mmConversionQuotedCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion#mmFinancialCenter
 * SecuritiesConversion.mmFinancialCenter}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion#mmMinimumNoticeDays
 * SecuritiesConversion.mmMinimumNoticeDays}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion#mmNoticePeriodType
 * SecuritiesConversion.mmNoticePeriodType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion#mmProtectionAgainstDilutionIndicator
 * SecuritiesConversion.mmProtectionAgainstDilutionIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion#mmReverseConversionIndicator
 * SecuritiesConversion.mmReverseConversionIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion#mmSecurityIdentification
 * SecuritiesConversion.mmSecurityIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion#mmPartyType
 * SecuritiesConversion.mmPartyType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion#mmContractSize
 * SecuritiesConversion.mmContractSize}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Security#mmConversion
 * Security.mmConversion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmRelatedSecuritiesConversion
 * SecuritiesPricing.mmRelatedSecuritiesConversion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmSecuritiesConversion
 * DateTimePeriod.mmSecuritiesConversion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmMinimumExercisableQuantitySecuritiesConversion
 * SecuritiesQuantity.mmMinimumExercisableQuantitySecuritiesConversion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmMinimumExercisableMultipleQuantitySecuritiesConversion
 * SecuritiesQuantity.mmMinimumExercisableMultipleQuantitySecuritiesConversion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmMaximumExercisableQuantitySecuritiesConversion
 * SecuritiesQuantity.mmMaximumExercisableQuantitySecuritiesConversion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmRatioDenominatorSecuritiesConversion
 * SecuritiesQuantity.mmRatioDenominatorSecuritiesConversion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmRatioNumeratorSecuritiesConversion
 * SecuritiesQuantity.mmRatioNumeratorSecuritiesConversion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#mmCurrencyExchangeForSecuritiesConversion
 * CurrencyExchange.mmCurrencyExchangeForSecuritiesConversion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Option#mmOptionConversionInformation
 * Option.mmOptionConversionInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.UnderlyingRatio#mmSecuritiesConversion
 * UnderlyingRatio.mmSecuritiesConversion}</li>
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
 * "SecuritiesConversion"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Conversion exchange of securities, generally convertible bonds or preferred equities, into another form of securities, usually common equities."
 * </li>
 * </ul>
 */
public class SecuritiesConversion {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected SecuritiesPricing conversionPrice;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmRelatedSecuritiesConversion
	 * SecuritiesPricing.mmRelatedSecuritiesConversion}</li>
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion
	 * SecuritiesConversion}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConversionPrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Price of one target security in the conversion."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmConversionPrice = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesConversion.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ConversionPrice";
			definition = "Price of one target security in the conversion.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmRelatedSecuritiesConversion;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
		}
	};
	protected ISODateTime conversionDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion
	 * SecuritiesConversion}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConversionDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Deadline by which a convertible security must be converted according to the terms of the issue."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmConversionDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesConversion.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ConversionDate";
			definition = "Deadline by which a convertible security must be converted according to the terms of the issue.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesConversion.class.getMethod("getConversionDate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected SecuritiesQuantity minimumExercisableQuantity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmMinimumExercisableQuantitySecuritiesConversion
	 * SecuritiesQuantity.mmMinimumExercisableQuantitySecuritiesConversion}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion
	 * SecuritiesConversion}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MinimumExercisableQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Minimum quantity of financial instrument or lot of rights/warrants that must be exercised."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmMinimumExercisableQuantity = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesConversion.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MinimumExercisableQuantity";
			definition = "Minimum quantity of financial instrument or lot of rights/warrants that must be exercised.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmMinimumExercisableQuantitySecuritiesConversion;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
		}
	};
	protected SecuritiesQuantity minimumExercisableMultipleQuantity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmMinimumExercisableMultipleQuantitySecuritiesConversion
	 * SecuritiesQuantity.
	 * mmMinimumExercisableMultipleQuantitySecuritiesConversion}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion
	 * SecuritiesConversion}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MinimumExercisableMultipleQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Minimum multiple quantity of financial instrument or lot of rights/warrants that must be exercised."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmMinimumExercisableMultipleQuantity = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesConversion.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MinimumExercisableMultipleQuantity";
			definition = "Minimum multiple quantity of financial instrument or lot of rights/warrants that must be exercised.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmMinimumExercisableMultipleQuantitySecuritiesConversion;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
		}
	};
	protected SecuritiesQuantity maximumExercisableQuantity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmMaximumExercisableQuantitySecuritiesConversion
	 * SecuritiesQuantity.mmMaximumExercisableQuantitySecuritiesConversion}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion
	 * SecuritiesConversion}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaximumExercisableQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the maximum quantity of financial instrument that may be exercised in the event."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmMaximumExercisableQuantity = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesConversion.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MaximumExercisableQuantity";
			definition = "Indicates the maximum quantity of financial instrument that may be exercised in the event.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmMaximumExercisableQuantitySecuritiesConversion;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
		}
	};
	protected ConversionTypeCode conversionType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ConversionTypeCode
	 * ConversionTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion
	 * SecuritiesConversion}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConversionType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the conversion type of an instrument."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmConversionType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesConversion.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ConversionType";
			definition = "Specifies the conversion type of an instrument.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ConversionTypeCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesConversion.class.getMethod("getConversionType", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected DateTimePeriod conversionPeriod;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmSecuritiesConversion
	 * DateTimePeriod.mmSecuritiesConversion}</li>
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion
	 * SecuritiesConversion}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConversionPeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Period during which a convertible security may be converted according to the terms of the issue."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmConversionPeriod = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesConversion.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ConversionPeriod";
			definition = "Period during which a convertible security may be converted according to the terms of the issue.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmSecuritiesConversion;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmObject();
		}
	};
	protected SecuritiesQuantity conversionRatioDenominator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmRatioDenominatorSecuritiesConversion
	 * SecuritiesQuantity.mmRatioDenominatorSecuritiesConversion}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion
	 * SecuritiesConversion}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConversionRatioDenominator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number of held securities for the conversion."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmConversionRatioDenominator = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesConversion.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ConversionRatioDenominator";
			definition = "Number of held securities for the conversion.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmRatioDenominatorSecuritiesConversion;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
		}
	};
	protected SecuritiesQuantity conversionRatioNumerator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmRatioNumeratorSecuritiesConversion
	 * SecuritiesQuantity.mmRatioNumeratorSecuritiesConversion}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion
	 * SecuritiesConversion}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConversionRatioNumerator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number of target securities for the conversion."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmConversionRatioNumerator = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesConversion.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ConversionRatioNumerator";
			definition = "Number of target securities for the conversion.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmRatioNumeratorSecuritiesConversion;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.UnderlyingRatio> ratio;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.UnderlyingRatio#mmSecuritiesConversion
	 * UnderlyingRatio.mmSecuritiesConversion}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.UnderlyingRatio
	 * UnderlyingRatio}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion
	 * SecuritiesConversion}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Ratio"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Ratio applied to convert the related security."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRatio = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesConversion.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Ratio";
			definition = "Ratio applied to convert the related security.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.UnderlyingRatio.mmSecuritiesConversion;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.UnderlyingRatio.mmObject();
		}
	};
	protected CurrencyExchange conversionUnitCurrency;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#mmCurrencyExchangeForSecuritiesConversion
	 * CurrencyExchange.mmCurrencyExchangeForSecuritiesConversion}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CurrencyExchange
	 * CurrencyExchange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion
	 * SecuritiesConversion}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConversionUnitCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Currency in which the rate of exchange is expressed in a currency exchange. In the example 1GBP = xxxCUR, the unit currency is GBP."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmConversionUnitCurrency = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesConversion.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ConversionUnitCurrency";
			definition = "Currency in which the rate of exchange is expressed in a currency exchange. In the example 1GBP = xxxCUR, the unit currency is GBP.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CurrencyExchange.mmCurrencyExchangeForSecuritiesConversion;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CurrencyExchange.mmObject();
		}
	};
	protected Option relatedOption;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Option#mmOptionConversionInformation
	 * Option.mmOptionConversionInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Option Option}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion
	 * SecuritiesConversion}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedOption"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Option for which securities conversion information is provided."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRelatedOption = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesConversion.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedOption";
			definition = "Option for which securities conversion information is provided.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Option.mmOptionConversionInformation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Option.mmObject();
		}
	};
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion
	 * SecuritiesConversion}</li>
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
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesConversion.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BusinessDayConvention";
			definition = "Convention used for adjusting a date when it is not a business day.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> BusinessDayConventionCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesConversion.class.getMethod("getBusinessDayConvention", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ChoiceCode conversionChoice;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.ChoiceCode
	 * ChoiceCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion
	 * SecuritiesConversion}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConversionChoice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the conversion is mandatory or optional."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmConversionChoice = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesConversion.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ConversionChoice";
			definition = "Specifies whether the conversion is mandatory or optional.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ChoiceCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesConversion.class.getMethod("getConversionChoice", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected BaseOneRate conversionFixedExchangeRate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.BaseOneRate
	 * BaseOneRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion
	 * SecuritiesConversion}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConversionFixedExchangeRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Currency exchange rate between the bond currency and the underlying equity currency used to calculate the convertion ratio."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmConversionFixedExchangeRate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesConversion.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ConversionFixedExchangeRate";
			definition = "Currency exchange rate between the bond currency and the underlying equity currency used to calculate the convertion ratio.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> BaseOneRate.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesConversion.class.getMethod("getConversionFixedExchangeRate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CurrencyAndAmount conversionMarginAmount;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion
	 * SecuritiesConversion}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConversionMarginAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount of cash needed for the conversion."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmConversionMarginAmount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesConversion.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ConversionMarginAmount";
			definition = "Amount of cash needed for the conversion.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesConversion.class.getMethod("getConversionMarginAmount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CorporateActionOptionCode conversionOption;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionOptionCode
	 * CorporateActionOptionCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion
	 * SecuritiesConversion}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConversionOption"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies information about the choices offered to the holder of a conversion."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmConversionOption = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesConversion.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ConversionOption";
			definition = "Specifies information about the choices offered to the holder of a conversion.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CorporateActionOptionCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesConversion.class.getMethod("getConversionOption", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CurrencyCode conversionQuotedCurrency;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CurrencyCode
	 * CurrencyCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LoanContract1#mmSettlementCurrency
	 * LoanContract1.mmSettlementCurrency}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion
	 * SecuritiesConversion}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConversionQuotedCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Currency into which the base currency is converted, in a currency exchange."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmConversionQuotedCurrency = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(LoanContract1.mmSettlementCurrency);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesConversion.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ConversionQuotedCurrency";
			definition = "Currency into which the base currency is converted, in a currency exchange.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesConversion.class.getMethod("getConversionQuotedCurrency", new Class[]{});
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion
	 * SecuritiesConversion}</li>
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
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesConversion.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FinancialCenter";
			definition = "Financial place  taken into account to adjust the date and time, as defined within the business day convention.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> FinancialCenterCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesConversion.class.getMethod("getFinancialCenter", new Class[]{});
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion
	 * SecuritiesConversion}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MinimumNoticeDays"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Minimum number of days that must be given by either the issuer or the holder before conversion can take place."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmMinimumNoticeDays = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesConversion.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MinimumNoticeDays";
			definition = "Minimum number of days that must be given by either the issuer or the holder before conversion can take place.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesConversion.class.getMethod("getMinimumNoticeDays", new Class[]{});
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion
	 * SecuritiesConversion}</li>
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
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesConversion.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NoticePeriodType";
			definition = "Specifies the type of notice period.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> NoticePeriodTypeCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesConversion.class.getMethod("getNoticePeriodType", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected YesNoIndicator protectionAgainstDilutionIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion
	 * SecuritiesConversion}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProtectionAgainstDilutionIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the security is protected against dilution with regards to capital events."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmProtectionAgainstDilutionIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesConversion.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ProtectionAgainstDilutionIndicator";
			definition = "Indicates whether the security is protected against dilution with regards to capital events.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesConversion.class.getMethod("getProtectionAgainstDilutionIndicator", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected YesNoIndicator reverseConversionIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion
	 * SecuritiesConversion}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReverseConversionIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the bond is convertible into an equity and back to the bond."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmReverseConversionIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesConversion.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ReverseConversionIndicator";
			definition = "Indicates whether the bond is convertible into an equity and back to the bond.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesConversion.class.getMethod("getReverseConversionIndicator", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Security securityIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmConversion
	 * Security.mmConversion}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Security Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion
	 * SecuritiesConversion}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecurityIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "ISIN identification of the related financial instrument into which this security can be converted."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmSecurityIdentification = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesConversion.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecurityIdentification";
			definition = "ISIN identification of the related financial instrument into which this security can be converted.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Security.mmConversion;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion
	 * SecuritiesConversion}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartyType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies if the issuer or the holder are allowed to convert the security into another one."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmPartyType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesConversion.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PartyType";
			definition = "Specifies if the issuer or the holder are allowed to convert the security into another one.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PartyTypeCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesConversion.class.getMethod("getPartyType", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected BaseOneRate contractSize;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.BaseOneRate
	 * BaseOneRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion
	 * SecuritiesConversion}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ContractSize"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Ratio or multiplying factor used to convert one contract into a quantity."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmContractSize = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesConversion.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ContractSize";
			definition = "Ratio or multiplying factor used to convert one contract into a quantity.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> BaseOneRate.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesConversion.class.getMethod("getContractSize", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SecuritiesConversion";
				definition = "Conversion exchange of securities, generally convertible bonds or preferred equities, into another form of securities, usually common equities.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Security.mmConversion, com.tools20022.repository.entity.SecuritiesPricing.mmRelatedSecuritiesConversion,
						com.tools20022.repository.entity.DateTimePeriod.mmSecuritiesConversion, com.tools20022.repository.entity.SecuritiesQuantity.mmMinimumExercisableQuantitySecuritiesConversion,
						com.tools20022.repository.entity.SecuritiesQuantity.mmMinimumExercisableMultipleQuantitySecuritiesConversion, com.tools20022.repository.entity.SecuritiesQuantity.mmMaximumExercisableQuantitySecuritiesConversion,
						com.tools20022.repository.entity.SecuritiesQuantity.mmRatioDenominatorSecuritiesConversion, com.tools20022.repository.entity.SecuritiesQuantity.mmRatioNumeratorSecuritiesConversion,
						com.tools20022.repository.entity.CurrencyExchange.mmCurrencyExchangeForSecuritiesConversion, com.tools20022.repository.entity.Option.mmOptionConversionInformation,
						com.tools20022.repository.entity.UnderlyingRatio.mmSecuritiesConversion);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesConversion.mmConversionPrice, com.tools20022.repository.entity.SecuritiesConversion.mmConversionDate,
						com.tools20022.repository.entity.SecuritiesConversion.mmMinimumExercisableQuantity, com.tools20022.repository.entity.SecuritiesConversion.mmMinimumExercisableMultipleQuantity,
						com.tools20022.repository.entity.SecuritiesConversion.mmMaximumExercisableQuantity, com.tools20022.repository.entity.SecuritiesConversion.mmConversionType,
						com.tools20022.repository.entity.SecuritiesConversion.mmConversionPeriod, com.tools20022.repository.entity.SecuritiesConversion.mmConversionRatioDenominator,
						com.tools20022.repository.entity.SecuritiesConversion.mmConversionRatioNumerator, com.tools20022.repository.entity.SecuritiesConversion.mmRatio,
						com.tools20022.repository.entity.SecuritiesConversion.mmConversionUnitCurrency, com.tools20022.repository.entity.SecuritiesConversion.mmRelatedOption,
						com.tools20022.repository.entity.SecuritiesConversion.mmBusinessDayConvention, com.tools20022.repository.entity.SecuritiesConversion.mmConversionChoice,
						com.tools20022.repository.entity.SecuritiesConversion.mmConversionFixedExchangeRate, com.tools20022.repository.entity.SecuritiesConversion.mmConversionMarginAmount,
						com.tools20022.repository.entity.SecuritiesConversion.mmConversionOption, com.tools20022.repository.entity.SecuritiesConversion.mmConversionQuotedCurrency,
						com.tools20022.repository.entity.SecuritiesConversion.mmFinancialCenter, com.tools20022.repository.entity.SecuritiesConversion.mmMinimumNoticeDays,
						com.tools20022.repository.entity.SecuritiesConversion.mmNoticePeriodType, com.tools20022.repository.entity.SecuritiesConversion.mmProtectionAgainstDilutionIndicator,
						com.tools20022.repository.entity.SecuritiesConversion.mmReverseConversionIndicator, com.tools20022.repository.entity.SecuritiesConversion.mmSecurityIdentification,
						com.tools20022.repository.entity.SecuritiesConversion.mmPartyType, com.tools20022.repository.entity.SecuritiesConversion.mmContractSize);
			}

			@Override
			public Class<?> getInstanceClass() {
				return SecuritiesConversion.class;
			}
		});
		return mmObject_lazy.get();
	}

	public SecuritiesPricing getConversionPrice() {
		return conversionPrice;
	}

	public SecuritiesConversion setConversionPrice(com.tools20022.repository.entity.SecuritiesPricing conversionPrice) {
		this.conversionPrice = Objects.requireNonNull(conversionPrice);
		return this;
	}

	public ISODateTime getConversionDate() {
		return conversionDate;
	}

	public SecuritiesConversion setConversionDate(ISODateTime conversionDate) {
		this.conversionDate = Objects.requireNonNull(conversionDate);
		return this;
	}

	public SecuritiesQuantity getMinimumExercisableQuantity() {
		return minimumExercisableQuantity;
	}

	public SecuritiesConversion setMinimumExercisableQuantity(com.tools20022.repository.entity.SecuritiesQuantity minimumExercisableQuantity) {
		this.minimumExercisableQuantity = Objects.requireNonNull(minimumExercisableQuantity);
		return this;
	}

	public SecuritiesQuantity getMinimumExercisableMultipleQuantity() {
		return minimumExercisableMultipleQuantity;
	}

	public SecuritiesConversion setMinimumExercisableMultipleQuantity(com.tools20022.repository.entity.SecuritiesQuantity minimumExercisableMultipleQuantity) {
		this.minimumExercisableMultipleQuantity = Objects.requireNonNull(minimumExercisableMultipleQuantity);
		return this;
	}

	public SecuritiesQuantity getMaximumExercisableQuantity() {
		return maximumExercisableQuantity;
	}

	public SecuritiesConversion setMaximumExercisableQuantity(com.tools20022.repository.entity.SecuritiesQuantity maximumExercisableQuantity) {
		this.maximumExercisableQuantity = Objects.requireNonNull(maximumExercisableQuantity);
		return this;
	}

	public ConversionTypeCode getConversionType() {
		return conversionType;
	}

	public SecuritiesConversion setConversionType(ConversionTypeCode conversionType) {
		this.conversionType = Objects.requireNonNull(conversionType);
		return this;
	}

	public DateTimePeriod getConversionPeriod() {
		return conversionPeriod;
	}

	public SecuritiesConversion setConversionPeriod(com.tools20022.repository.entity.DateTimePeriod conversionPeriod) {
		this.conversionPeriod = Objects.requireNonNull(conversionPeriod);
		return this;
	}

	public SecuritiesQuantity getConversionRatioDenominator() {
		return conversionRatioDenominator;
	}

	public SecuritiesConversion setConversionRatioDenominator(com.tools20022.repository.entity.SecuritiesQuantity conversionRatioDenominator) {
		this.conversionRatioDenominator = Objects.requireNonNull(conversionRatioDenominator);
		return this;
	}

	public SecuritiesQuantity getConversionRatioNumerator() {
		return conversionRatioNumerator;
	}

	public SecuritiesConversion setConversionRatioNumerator(com.tools20022.repository.entity.SecuritiesQuantity conversionRatioNumerator) {
		this.conversionRatioNumerator = Objects.requireNonNull(conversionRatioNumerator);
		return this;
	}

	public List<UnderlyingRatio> getRatio() {
		return ratio == null ? ratio = new ArrayList<>() : ratio;
	}

	public SecuritiesConversion setRatio(List<com.tools20022.repository.entity.UnderlyingRatio> ratio) {
		this.ratio = Objects.requireNonNull(ratio);
		return this;
	}

	public CurrencyExchange getConversionUnitCurrency() {
		return conversionUnitCurrency;
	}

	public SecuritiesConversion setConversionUnitCurrency(com.tools20022.repository.entity.CurrencyExchange conversionUnitCurrency) {
		this.conversionUnitCurrency = Objects.requireNonNull(conversionUnitCurrency);
		return this;
	}

	public Optional<Option> getRelatedOption() {
		return relatedOption == null ? Optional.empty() : Optional.of(relatedOption);
	}

	public SecuritiesConversion setRelatedOption(com.tools20022.repository.entity.Option relatedOption) {
		this.relatedOption = relatedOption;
		return this;
	}

	public BusinessDayConventionCode getBusinessDayConvention() {
		return businessDayConvention;
	}

	public SecuritiesConversion setBusinessDayConvention(BusinessDayConventionCode businessDayConvention) {
		this.businessDayConvention = Objects.requireNonNull(businessDayConvention);
		return this;
	}

	public ChoiceCode getConversionChoice() {
		return conversionChoice;
	}

	public SecuritiesConversion setConversionChoice(ChoiceCode conversionChoice) {
		this.conversionChoice = Objects.requireNonNull(conversionChoice);
		return this;
	}

	public BaseOneRate getConversionFixedExchangeRate() {
		return conversionFixedExchangeRate;
	}

	public SecuritiesConversion setConversionFixedExchangeRate(BaseOneRate conversionFixedExchangeRate) {
		this.conversionFixedExchangeRate = Objects.requireNonNull(conversionFixedExchangeRate);
		return this;
	}

	public CurrencyAndAmount getConversionMarginAmount() {
		return conversionMarginAmount;
	}

	public SecuritiesConversion setConversionMarginAmount(CurrencyAndAmount conversionMarginAmount) {
		this.conversionMarginAmount = Objects.requireNonNull(conversionMarginAmount);
		return this;
	}

	public CorporateActionOptionCode getConversionOption() {
		return conversionOption;
	}

	public SecuritiesConversion setConversionOption(CorporateActionOptionCode conversionOption) {
		this.conversionOption = Objects.requireNonNull(conversionOption);
		return this;
	}

	public CurrencyCode getConversionQuotedCurrency() {
		return conversionQuotedCurrency;
	}

	public SecuritiesConversion setConversionQuotedCurrency(CurrencyCode conversionQuotedCurrency) {
		this.conversionQuotedCurrency = Objects.requireNonNull(conversionQuotedCurrency);
		return this;
	}

	public FinancialCenterCode getFinancialCenter() {
		return financialCenter;
	}

	public SecuritiesConversion setFinancialCenter(FinancialCenterCode financialCenter) {
		this.financialCenter = Objects.requireNonNull(financialCenter);
		return this;
	}

	public Number getMinimumNoticeDays() {
		return minimumNoticeDays;
	}

	public SecuritiesConversion setMinimumNoticeDays(Number minimumNoticeDays) {
		this.minimumNoticeDays = Objects.requireNonNull(minimumNoticeDays);
		return this;
	}

	public NoticePeriodTypeCode getNoticePeriodType() {
		return noticePeriodType;
	}

	public SecuritiesConversion setNoticePeriodType(NoticePeriodTypeCode noticePeriodType) {
		this.noticePeriodType = Objects.requireNonNull(noticePeriodType);
		return this;
	}

	public YesNoIndicator getProtectionAgainstDilutionIndicator() {
		return protectionAgainstDilutionIndicator;
	}

	public SecuritiesConversion setProtectionAgainstDilutionIndicator(YesNoIndicator protectionAgainstDilutionIndicator) {
		this.protectionAgainstDilutionIndicator = Objects.requireNonNull(protectionAgainstDilutionIndicator);
		return this;
	}

	public YesNoIndicator getReverseConversionIndicator() {
		return reverseConversionIndicator;
	}

	public SecuritiesConversion setReverseConversionIndicator(YesNoIndicator reverseConversionIndicator) {
		this.reverseConversionIndicator = Objects.requireNonNull(reverseConversionIndicator);
		return this;
	}

	public Security getSecurityIdentification() {
		return securityIdentification;
	}

	public SecuritiesConversion setSecurityIdentification(com.tools20022.repository.entity.Security securityIdentification) {
		this.securityIdentification = Objects.requireNonNull(securityIdentification);
		return this;
	}

	public PartyTypeCode getPartyType() {
		return partyType;
	}

	public SecuritiesConversion setPartyType(PartyTypeCode partyType) {
		this.partyType = Objects.requireNonNull(partyType);
		return this;
	}

	public BaseOneRate getContractSize() {
		return contractSize;
	}

	public SecuritiesConversion setContractSize(BaseOneRate contractSize) {
		this.contractSize = Objects.requireNonNull(contractSize);
		return this;
	}
}