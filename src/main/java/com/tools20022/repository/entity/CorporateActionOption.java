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
import com.tools20022.repository.datatype.Exact3NumericText;
import com.tools20022.repository.datatype.YesNoIndicator;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

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
 * {@linkplain com.tools20022.repository.entity.CorporateActionOption#OptionNumber
 * CorporateActionOption.OptionNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionOption#OptionType
 * CorporateActionOption.OptionType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionOption#FractionDisposition
 * CorporateActionOption.FractionDisposition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionOption#CurrencyOption
 * CorporateActionOption.CurrencyOption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionOption#RelatedChoiceCorporateAction
 * CorporateActionOption.RelatedChoiceCorporateAction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionOption#CorporateActionElection
 * CorporateActionOption.CorporateActionElection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionOption#OptionFeatures
 * CorporateActionOption.OptionFeatures}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionOption#ActionPeriod
 * CorporateActionOption.ActionPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionOption#OfferType
 * CorporateActionOption.OfferType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionOption#ChargesAppliedIndicator
 * CorporateActionOption.ChargesAppliedIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionOption#WithdrawalAllowedIndicator
 * CorporateActionOption.WithdrawalAllowedIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionOption#ChangeAllowedIndicator
 * CorporateActionOption.ChangeAllowedIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionOption#CorporateActionOptionServicing
 * CorporateActionOption.CorporateActionOptionServicing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionOption#ProceedsDefinition
 * CorporateActionOption.ProceedsDefinition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionOption#Distribution
 * CorporateActionOption.Distribution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionOption#Default
 * CorporateActionOption.Default}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#CorporateActionOption
 * DateTimePeriod.CorporateActionOption}</li>
 * <li>{@linkplain com.tools20022.repository.entity.ProceedsDefinition#Option
 * ProceedsDefinition.Option}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionElection#Option
 * CorporateActionElection.Option}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ChoiceCorporateAction#CorporateActionOptionDefinition
 * ChoiceCorporateAction.CorporateActionOptionDefinition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionDistribution#Option
 * CorporateActionDistribution.Option}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionOptionServicing#RelatedOption
 * CorporateActionOptionServicing.RelatedOption}</li>
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
 * "CorporateActionOption"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides information about the alternatives available to an account owner when participating to a corporate action event. This is defined at a general level without looking at the specificities of the securities balances."
 * </li>
 * </ul>
 */
public class CorporateActionOption {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
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
	public static final MMBusinessAttribute OptionNumber = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> CorporateActionOption.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OptionNumber";
			definition = "Number identifying the available corporate action options.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Exact3NumericText.mmObject();
		}
	};
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
	public static final MMBusinessAttribute OptionType = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> CorporateActionOption.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OptionType";
			definition = "Type of corporate action options available to the account owner.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CorporateActionOptionCode.mmObject();
		}
	};
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
	public static final MMBusinessAttribute FractionDisposition = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> CorporateActionOption.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FractionDisposition";
			definition = "Treatment of the fractions resulting from derived securities will be processed or how prorated decisions will be rounding, if provided with a pro ration rate.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> FractionDispositionTypeCode.mmObject();
		}
	};
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
	public static final MMBusinessAttribute CurrencyOption = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> CorporateActionOption.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CurrencyOption";
			definition = "Currency choice given to the investor.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}
	};
	/**
	 * Corporate action for which one or more options are provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ChoiceCorporateAction#CorporateActionOptionDefinition
	 * ChoiceCorporateAction.CorporateActionOptionDefinition}</li>
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
	public static final MMBusinessAssociationEnd RelatedChoiceCorporateAction = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CorporateActionOption.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedChoiceCorporateAction";
			definition = "Corporate action for which one or more options are provided.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> ChoiceCorporateAction.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.ChoiceCorporateAction.CorporateActionOptionDefinition;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Election process which selected a specific option.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionElection#Option
	 * CorporateActionElection.Option}</li>
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
	public static final MMBusinessAssociationEnd CorporateActionElection = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CorporateActionOption.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CorporateActionElection";
			definition = "Election process which selected a specific option.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.CorporateActionElection.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionElection.Option;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
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
	public static final MMBusinessAttribute OptionFeatures = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> CorporateActionOption.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OptionFeatures";
			definition = "Features that may apply to a corporate action option.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> OptionFeaturesCode.mmObject();
		}
	};
	/**
	 * Period during which the specified option remains valid, eg, offer period.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#CorporateActionOption
	 * DateTimePeriod.CorporateActionOption}</li>
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
	public static final MMBusinessAssociationEnd ActionPeriod = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CorporateActionOption.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ActionPeriod";
			definition = "Period during which the specified option remains valid, eg, offer period.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> DateTimePeriod.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.CorporateActionOption;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
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
	public static final MMBusinessAttribute OfferType = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> CorporateActionOption.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OfferType";
			definition = "Conditions that apply to the offer.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> OfferTypeV2Code.mmObject();
		}
	};
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
	public static final MMBusinessAttribute ChargesAppliedIndicator = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> CorporateActionOption.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ChargesAppliedIndicator";
			definition = "Indicates whether charges apply to the holder, for instance redemption charges.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
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
	public static final MMBusinessAttribute WithdrawalAllowedIndicator = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> CorporateActionOption.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "WithdrawalAllowedIndicator";
			definition = "Indicates whether withdrawal of instruction is allowed.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
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
	public static final MMBusinessAttribute ChangeAllowedIndicator = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> CorporateActionOption.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ChangeAllowedIndicator";
			definition = "Indicates whether change of instruction is allowed.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Calculation of the entitlement on the basis of the proposed option.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionOptionServicing#RelatedOption
	 * CorporateActionOptionServicing.RelatedOption}</li>
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
	public static final MMBusinessAssociationEnd CorporateActionOptionServicing = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CorporateActionOption.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CorporateActionOptionServicing";
			definition = "Calculation of the entitlement on the basis of the proposed option.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.CorporateActionOptionServicing.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionOptionServicing.RelatedOption;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Definition of exchanges of cash and / or securities available in the
	 * processing of corporate actions.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ProceedsDefinition#Option
	 * ProceedsDefinition.Option}</li>
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
	public static final MMBusinessAssociationEnd ProceedsDefinition = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CorporateActionOption.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ProceedsDefinition";
			definition = "Definition of exchanges of cash and / or securities available in the processing of corporate actions.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.ProceedsDefinition.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.ProceedsDefinition.Option;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Distribution process for which an option is selected.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDistribution#Option
	 * CorporateActionDistribution.Option}</li>
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
	public static final MMBusinessAssociationEnd Distribution = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CorporateActionOption.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Distribution";
			definition = "Distribution process for which an option is selected.";
			minOccurs = 0;
			type_lazy = () -> CorporateActionDistribution.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionDistribution.Option;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
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
	public static final MMBusinessAttribute Default = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> CorporateActionOption.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Default";
			definition = "Specifies whether the option is the default option or not.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CorporateActionOption";
				definition = "Provides information about the alternatives available to an account owner when participating to a corporate action event. This is defined at a general level without looking at the specificities of the securities balances.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.DateTimePeriod.CorporateActionOption, com.tools20022.repository.entity.ProceedsDefinition.Option,
						com.tools20022.repository.entity.CorporateActionElection.Option, com.tools20022.repository.entity.ChoiceCorporateAction.CorporateActionOptionDefinition,
						com.tools20022.repository.entity.CorporateActionDistribution.Option, com.tools20022.repository.entity.CorporateActionOptionServicing.RelatedOption);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CorporateActionOption.OptionNumber, com.tools20022.repository.entity.CorporateActionOption.OptionType,
						com.tools20022.repository.entity.CorporateActionOption.FractionDisposition, com.tools20022.repository.entity.CorporateActionOption.CurrencyOption,
						com.tools20022.repository.entity.CorporateActionOption.RelatedChoiceCorporateAction, com.tools20022.repository.entity.CorporateActionOption.CorporateActionElection,
						com.tools20022.repository.entity.CorporateActionOption.OptionFeatures, com.tools20022.repository.entity.CorporateActionOption.ActionPeriod, com.tools20022.repository.entity.CorporateActionOption.OfferType,
						com.tools20022.repository.entity.CorporateActionOption.ChargesAppliedIndicator, com.tools20022.repository.entity.CorporateActionOption.WithdrawalAllowedIndicator,
						com.tools20022.repository.entity.CorporateActionOption.ChangeAllowedIndicator, com.tools20022.repository.entity.CorporateActionOption.CorporateActionOptionServicing,
						com.tools20022.repository.entity.CorporateActionOption.ProceedsDefinition, com.tools20022.repository.entity.CorporateActionOption.Distribution, com.tools20022.repository.entity.CorporateActionOption.Default);
			}
		});
		return mmObject_lazy.get();
	}
}