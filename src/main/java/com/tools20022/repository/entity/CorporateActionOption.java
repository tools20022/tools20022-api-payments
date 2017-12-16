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
import com.tools20022.repository.datatype.Exact3NumericText;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.GeneratedRepository;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Provides information about the alternatives available to an account owner
 * when participating to a corporate action event. This is defined at a general
 * level without looking at the specificities of the securities balances.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="CorporateActionOption"
 * src="doc-files/CorporateActionOption.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionOption#mmOptionNumber
 * CorporateActionOption.mmOptionNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionOption#mmOptionType
 * CorporateActionOption.mmOptionType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionOption#mmFractionDisposition
 * CorporateActionOption.mmFractionDisposition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionOption#mmCurrencyOption
 * CorporateActionOption.mmCurrencyOption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionOption#mmRelatedChoiceCorporateAction
 * CorporateActionOption.mmRelatedChoiceCorporateAction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionOption#mmCorporateActionElection
 * CorporateActionOption.mmCorporateActionElection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionOption#mmOptionFeatures
 * CorporateActionOption.mmOptionFeatures}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionOption#mmActionPeriod
 * CorporateActionOption.mmActionPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionOption#mmOfferType
 * CorporateActionOption.mmOfferType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionOption#mmChargesAppliedIndicator
 * CorporateActionOption.mmChargesAppliedIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionOption#mmWithdrawalAllowedIndicator
 * CorporateActionOption.mmWithdrawalAllowedIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionOption#mmChangeAllowedIndicator
 * CorporateActionOption.mmChangeAllowedIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionOption#mmCorporateActionOptionServicing
 * CorporateActionOption.mmCorporateActionOptionServicing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionOption#mmProceedsDefinition
 * CorporateActionOption.mmProceedsDefinition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionOption#mmDistribution
 * CorporateActionOption.mmDistribution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionOption#mmDefault
 * CorporateActionOption.mmDefault}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmCorporateActionOption
 * DateTimePeriod.mmCorporateActionOption}</li>
 * <li>{@linkplain com.tools20022.repository.entity.ProceedsDefinition#mmOption
 * ProceedsDefinition.mmOption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionElection#mmOption
 * CorporateActionElection.mmOption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ChoiceCorporateAction#mmCorporateActionOptionDefinition
 * ChoiceCorporateAction.mmCorporateActionOptionDefinition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionDistribution#mmOption
 * CorporateActionDistribution.mmOption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionOptionServicing#mmRelatedOption
 * CorporateActionOptionServicing.mmRelatedOption}</li>
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
 * "CorporateActionOption"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides information about the alternatives available to an account owner when participating to a corporate action event. This is defined at a general level without looking at the specificities of the securities balances."
 * </li>
 * </ul>
 */
public class CorporateActionOption {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected Exact3NumericText optionNumber;
	/**
	 * Number identifying the available corporate action options.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Exact3NumericText
	 * Exact3NumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionOption
	 * CorporateActionOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Number identifying the available corporate action options."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmOptionNumber = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionOption.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OptionNumber";
			definition = "Number identifying the available corporate action options.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Exact3NumericText.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CorporateActionOption.class.getMethod("getOptionNumber", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CorporateActionOptionCode optionType;
	/**
	 * Type of corporate action options available to the account owner.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.entity.CorporateActionOption
	 * CorporateActionOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Type of corporate action options available to the account owner."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmOptionType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionOption.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OptionType";
			definition = "Type of corporate action options available to the account owner.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CorporateActionOptionCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CorporateActionOption.class.getMethod("getOptionType", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected FractionDispositionTypeCode fractionDisposition;
	/**
	 * Treatment of the fractions resulting from derived securities will be
	 * processed or how prorated decisions will be rounding, if provided with a
	 * pro ration rate.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.FractionDispositionTypeCode
	 * FractionDispositionTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionOption
	 * CorporateActionOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FractionDisposition"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Treatment of the fractions resulting from derived securities will be processed or how prorated decisions will be rounding, if provided with a pro ration rate."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmFractionDisposition = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionOption.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FractionDisposition";
			definition = "Treatment of the fractions resulting from derived securities will be processed or how prorated decisions will be rounding, if provided with a pro ration rate.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> FractionDispositionTypeCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CorporateActionOption.class.getMethod("getFractionDisposition", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CurrencyCode currencyOption;
	/**
	 * Currency choice given to the investor.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CurrencyCode
	 * CurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionOption
	 * CorporateActionOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrencyOption"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Currency choice given to the investor."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmCurrencyOption = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionOption.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CurrencyOption";
			definition = "Currency choice given to the investor.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CorporateActionOption.class.getMethod("getCurrencyOption", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ChoiceCorporateAction relatedChoiceCorporateAction;
	/**
	 * Corporate action for which one or more options are provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ChoiceCorporateAction#mmCorporateActionOptionDefinition
	 * ChoiceCorporateAction.mmCorporateActionOptionDefinition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.ChoiceCorporateAction
	 * ChoiceCorporateAction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionOption
	 * CorporateActionOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedChoiceCorporateAction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Corporate action for which one or more options are provided."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRelatedChoiceCorporateAction = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionOption.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedChoiceCorporateAction";
			definition = "Corporate action for which one or more options are provided.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.ChoiceCorporateAction.mmCorporateActionOptionDefinition;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.ChoiceCorporateAction.mmObject();
		}
	};
	protected CorporateActionElection corporateActionElection;
	/**
	 * Election process which selected a specific option.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionElection#mmOption
	 * CorporateActionElection.mmOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionElection
	 * CorporateActionElection}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionOption
	 * CorporateActionOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateActionElection"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Election process which selected a specific option."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmCorporateActionElection = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionOption.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CorporateActionElection";
			definition = "Election process which selected a specific option.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionElection.mmOption;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CorporateActionElection.mmObject();
		}
	};
	protected OptionFeaturesCode optionFeatures;
	/**
	 * Features that may apply to a corporate action option.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.OptionFeaturesCode
	 * OptionFeaturesCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionOption
	 * CorporateActionOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionFeatures"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Features that may apply to a corporate action option."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmOptionFeatures = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionOption.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OptionFeatures";
			definition = "Features that may apply to a corporate action option.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> OptionFeaturesCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CorporateActionOption.class.getMethod("getOptionFeatures", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected DateTimePeriod actionPeriod;
	/**
	 * Period during which the specified option remains valid, eg, offer period.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmCorporateActionOption
	 * DateTimePeriod.mmCorporateActionOption}</li>
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
	 * {@linkplain com.tools20022.repository.entity.CorporateActionOption
	 * CorporateActionOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ActionPeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Period during which the specified option remains valid, eg, offer period."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmActionPeriod = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionOption.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ActionPeriod";
			definition = "Period during which the specified option remains valid, eg, offer period.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmCorporateActionOption;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmObject();
		}
	};
	protected OfferTypeV2Code offerType;
	/**
	 * Conditions that apply to the offer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.OfferTypeV2Code
	 * OfferTypeV2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionOption
	 * CorporateActionOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OfferType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Conditions that apply to the offer."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmOfferType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionOption.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OfferType";
			definition = "Conditions that apply to the offer.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> OfferTypeV2Code.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CorporateActionOption.class.getMethod("getOfferType", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected YesNoIndicator chargesAppliedIndicator;
	/**
	 * Indicates whether charges apply to the holder, for instance redemption
	 * charges.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.entity.CorporateActionOption
	 * CorporateActionOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChargesAppliedIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether charges apply to the holder, for instance redemption charges."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmChargesAppliedIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionOption.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ChargesAppliedIndicator";
			definition = "Indicates whether charges apply to the holder, for instance redemption charges.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CorporateActionOption.class.getMethod("getChargesAppliedIndicator", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected YesNoIndicator withdrawalAllowedIndicator;
	/**
	 * Indicates whether withdrawal of instruction is allowed.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.entity.CorporateActionOption
	 * CorporateActionOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WithdrawalAllowedIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether withdrawal of instruction is allowed."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmWithdrawalAllowedIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionOption.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "WithdrawalAllowedIndicator";
			definition = "Indicates whether withdrawal of instruction is allowed.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CorporateActionOption.class.getMethod("getWithdrawalAllowedIndicator", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected YesNoIndicator changeAllowedIndicator;
	/**
	 * Indicates whether change of instruction is allowed.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.entity.CorporateActionOption
	 * CorporateActionOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChangeAllowedIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether change of instruction is allowed."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmChangeAllowedIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionOption.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ChangeAllowedIndicator";
			definition = "Indicates whether change of instruction is allowed.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CorporateActionOption.class.getMethod("getChangeAllowedIndicator", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.CorporateActionOptionServicing> corporateActionOptionServicing;
	/**
	 * Calculation of the entitlement on the basis of the proposed option.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionOptionServicing#mmRelatedOption
	 * CorporateActionOptionServicing.mmRelatedOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionOptionServicing
	 * CorporateActionOptionServicing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionOption
	 * CorporateActionOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateActionOptionServicing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Calculation of the entitlement on the basis of the proposed option."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmCorporateActionOptionServicing = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionOption.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CorporateActionOptionServicing";
			definition = "Calculation of the entitlement on the basis of the proposed option.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionOptionServicing.mmRelatedOption;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CorporateActionOptionServicing.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.ProceedsDefinition> proceedsDefinition;
	/**
	 * Definition of exchanges of cash and / or securities available in the
	 * processing of corporate actions.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ProceedsDefinition#mmOption
	 * ProceedsDefinition.mmOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.ProceedsDefinition
	 * ProceedsDefinition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionOption
	 * CorporateActionOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProceedsDefinition"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Definition of exchanges of cash and / or securities available in the processing of corporate actions."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmProceedsDefinition = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionOption.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ProceedsDefinition";
			definition = "Definition of exchanges of cash and / or securities available in the processing of corporate actions.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.ProceedsDefinition.mmOption;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.ProceedsDefinition.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.CorporateActionDistribution> distribution;
	/**
	 * Distribution process for which an option is selected.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDistribution#mmOption
	 * CorporateActionDistribution.mmOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDistribution
	 * CorporateActionDistribution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionOption
	 * CorporateActionOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Distribution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Distribution process for which an option is selected."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmDistribution = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionOption.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Distribution";
			definition = "Distribution process for which an option is selected.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionDistribution.mmOption;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CorporateActionDistribution.mmObject();
		}
	};
	protected YesNoIndicator default_;
	/**
	 * Specifies whether the option is the default option or not.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.entity.CorporateActionOption
	 * CorporateActionOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Default"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the option is the default option or not."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmDefault = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionOption.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Default";
			definition = "Specifies whether the option is the default option or not.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CorporateActionOption.class.getMethod("getDefault", new Class[]{});
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
				name = "CorporateActionOption";
				definition = "Provides information about the alternatives available to an account owner when participating to a corporate action event. This is defined at a general level without looking at the specificities of the securities balances.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.DateTimePeriod.mmCorporateActionOption, com.tools20022.repository.entity.ProceedsDefinition.mmOption,
						com.tools20022.repository.entity.CorporateActionElection.mmOption, com.tools20022.repository.entity.ChoiceCorporateAction.mmCorporateActionOptionDefinition,
						com.tools20022.repository.entity.CorporateActionDistribution.mmOption, com.tools20022.repository.entity.CorporateActionOptionServicing.mmRelatedOption);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CorporateActionOption.mmOptionNumber, com.tools20022.repository.entity.CorporateActionOption.mmOptionType,
						com.tools20022.repository.entity.CorporateActionOption.mmFractionDisposition, com.tools20022.repository.entity.CorporateActionOption.mmCurrencyOption,
						com.tools20022.repository.entity.CorporateActionOption.mmRelatedChoiceCorporateAction, com.tools20022.repository.entity.CorporateActionOption.mmCorporateActionElection,
						com.tools20022.repository.entity.CorporateActionOption.mmOptionFeatures, com.tools20022.repository.entity.CorporateActionOption.mmActionPeriod, com.tools20022.repository.entity.CorporateActionOption.mmOfferType,
						com.tools20022.repository.entity.CorporateActionOption.mmChargesAppliedIndicator, com.tools20022.repository.entity.CorporateActionOption.mmWithdrawalAllowedIndicator,
						com.tools20022.repository.entity.CorporateActionOption.mmChangeAllowedIndicator, com.tools20022.repository.entity.CorporateActionOption.mmCorporateActionOptionServicing,
						com.tools20022.repository.entity.CorporateActionOption.mmProceedsDefinition, com.tools20022.repository.entity.CorporateActionOption.mmDistribution, com.tools20022.repository.entity.CorporateActionOption.mmDefault);
			}

			@Override
			public Class<?> getInstanceClass() {
				return CorporateActionOption.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Exact3NumericText getOptionNumber() {
		return optionNumber;
	}

	public void setOptionNumber(Exact3NumericText optionNumber) {
		this.optionNumber = optionNumber;
	}

	public CorporateActionOptionCode getOptionType() {
		return optionType;
	}

	public void setOptionType(CorporateActionOptionCode optionType) {
		this.optionType = optionType;
	}

	public FractionDispositionTypeCode getFractionDisposition() {
		return fractionDisposition;
	}

	public void setFractionDisposition(FractionDispositionTypeCode fractionDisposition) {
		this.fractionDisposition = fractionDisposition;
	}

	public CurrencyCode getCurrencyOption() {
		return currencyOption;
	}

	public void setCurrencyOption(CurrencyCode currencyOption) {
		this.currencyOption = currencyOption;
	}

	public ChoiceCorporateAction getRelatedChoiceCorporateAction() {
		return relatedChoiceCorporateAction;
	}

	public void setRelatedChoiceCorporateAction(com.tools20022.repository.entity.ChoiceCorporateAction relatedChoiceCorporateAction) {
		this.relatedChoiceCorporateAction = relatedChoiceCorporateAction;
	}

	public CorporateActionElection getCorporateActionElection() {
		return corporateActionElection;
	}

	public void setCorporateActionElection(com.tools20022.repository.entity.CorporateActionElection corporateActionElection) {
		this.corporateActionElection = corporateActionElection;
	}

	public OptionFeaturesCode getOptionFeatures() {
		return optionFeatures;
	}

	public void setOptionFeatures(OptionFeaturesCode optionFeatures) {
		this.optionFeatures = optionFeatures;
	}

	public DateTimePeriod getActionPeriod() {
		return actionPeriod;
	}

	public void setActionPeriod(com.tools20022.repository.entity.DateTimePeriod actionPeriod) {
		this.actionPeriod = actionPeriod;
	}

	public OfferTypeV2Code getOfferType() {
		return offerType;
	}

	public void setOfferType(OfferTypeV2Code offerType) {
		this.offerType = offerType;
	}

	public YesNoIndicator getChargesAppliedIndicator() {
		return chargesAppliedIndicator;
	}

	public void setChargesAppliedIndicator(YesNoIndicator chargesAppliedIndicator) {
		this.chargesAppliedIndicator = chargesAppliedIndicator;
	}

	public YesNoIndicator getWithdrawalAllowedIndicator() {
		return withdrawalAllowedIndicator;
	}

	public void setWithdrawalAllowedIndicator(YesNoIndicator withdrawalAllowedIndicator) {
		this.withdrawalAllowedIndicator = withdrawalAllowedIndicator;
	}

	public YesNoIndicator getChangeAllowedIndicator() {
		return changeAllowedIndicator;
	}

	public void setChangeAllowedIndicator(YesNoIndicator changeAllowedIndicator) {
		this.changeAllowedIndicator = changeAllowedIndicator;
	}

	public List<CorporateActionOptionServicing> getCorporateActionOptionServicing() {
		return corporateActionOptionServicing;
	}

	public void setCorporateActionOptionServicing(List<com.tools20022.repository.entity.CorporateActionOptionServicing> corporateActionOptionServicing) {
		this.corporateActionOptionServicing = corporateActionOptionServicing;
	}

	public List<ProceedsDefinition> getProceedsDefinition() {
		return proceedsDefinition;
	}

	public void setProceedsDefinition(List<com.tools20022.repository.entity.ProceedsDefinition> proceedsDefinition) {
		this.proceedsDefinition = proceedsDefinition;
	}

	public List<CorporateActionDistribution> getDistribution() {
		return distribution;
	}

	public void setDistribution(List<com.tools20022.repository.entity.CorporateActionDistribution> distribution) {
		this.distribution = distribution;
	}

	public YesNoIndicator getDefault() {
		return default_;
	}

	public void setDefault(YesNoIndicator default_) {
		this.default_ = default_;
	}
}