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

import com.tools20022.metamodel.ext.ISO15022Synonym;
import com.tools20022.metamodel.*;
import com.tools20022.repository.codeset.CurrencyCode;
import com.tools20022.repository.codeset.SettlementStandingInstructionDatabaseCode;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;

/**
 * Settlement instruction database information.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="StandingSettlementInstruction"
 * src="doc-files/StandingSettlementInstruction.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.StandingSettlementInstruction#mmSettlement
 * StandingSettlementInstruction.mmSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.StandingSettlementInstruction#mmFXStandingInstruction
 * StandingSettlementInstruction.mmFXStandingInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.StandingSettlementInstruction#mmSettlementStandingInstructionDatabase
 * StandingSettlementInstruction.mmSettlementStandingInstructionDatabase}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.StandingSettlementInstruction#mmIdentification
 * StandingSettlementInstruction.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.StandingSettlementInstruction#mmRelatedCollateralAgreement
 * StandingSettlementInstruction.mmRelatedCollateralAgreement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.StandingSettlementInstruction#mmSSIDatabaseName
 * StandingSettlementInstruction.mmSSIDatabaseName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.StandingSettlementInstruction#mmSSIDatabaseProvider
 * StandingSettlementInstruction.mmSSIDatabaseProvider}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.StandingSettlementInstruction#mmValidityPeriod
 * StandingSettlementInstruction.mmValidityPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.StandingSettlementInstruction#mmCurrency
 * StandingSettlementInstruction.mmCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.StandingSettlementInstruction#mmAsset
 * StandingSettlementInstruction.mmAsset}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Asset#mmStandingSettlementInstruction
 * Asset.mmStandingSettlementInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmRelatedStandingSettlementInstruction
 * DateTimePeriod.mmRelatedStandingSettlementInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Settlement#mmStandingSettlementInstruction
 * Settlement.mmStandingSettlementInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralAgreement#mmStandingSettlementInstructions
 * CollateralAgreement.mmStandingSettlementInstructions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SSIDatabaseProvider#mmStandingSettlementDatabase
 * SSIDatabaseProvider.mmStandingSettlementDatabase}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AgentCorporateActionStandingInstruction
 * AgentCorporateActionStandingInstruction}</li>
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
 * "StandingSettlementInstruction"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Settlement instruction database information."</li>
 * </ul>
 */
public class StandingSettlementInstruction {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected List<Settlement> settlement;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Settlement#mmStandingSettlementInstruction
	 * Settlement.mmStandingSettlementInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Settlement
	 * Settlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.StandingSettlementInstruction
	 * StandingSettlementInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Settlement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Settlement process to which the settlement instruction database applies."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<StandingSettlementInstruction, List<Settlement>> mmSettlement = new MMBusinessAssociationEnd<StandingSettlementInstruction, List<Settlement>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.StandingSettlementInstruction.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Settlement";
			definition = "Settlement process to which the settlement instruction database applies.";
			minOccurs = 0;
			opposite_lazy = () -> Settlement.mmStandingSettlementInstruction;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Settlement.mmObject();
		}

		@Override
		public List<Settlement> getValue(StandingSettlementInstruction obj) {
			return obj.getSettlement();
		}

		@Override
		public void setValue(StandingSettlementInstruction obj, List<Settlement> value) {
			obj.setSettlement(value);
		}
	};
	protected YesNoIndicator fXStandingInstruction;
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
	 * {@linkplain com.tools20022.repository.entity.StandingSettlementInstruction
	 * StandingSettlementInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FXStandingInstruction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the forex standing instruction in place should apply."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<StandingSettlementInstruction, YesNoIndicator> mmFXStandingInstruction = new MMBusinessAttribute<StandingSettlementInstruction, YesNoIndicator>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.StandingSettlementInstruction.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FXStandingInstruction";
			definition = "Specifies whether the forex standing instruction in place should apply.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(StandingSettlementInstruction obj) {
			return obj.getFXStandingInstruction();
		}

		@Override
		public void setValue(StandingSettlementInstruction obj, YesNoIndicator value) {
			obj.setFXStandingInstruction(value);
		}
	};
	protected SettlementStandingInstructionDatabaseCode settlementStandingInstructionDatabase;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementStandingInstructionDatabaseCode
	 * SettlementStandingInstructionDatabaseCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.StandingSettlementInstruction
	 * StandingSettlementInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::DBNM</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementStandingInstructionDatabase"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies what settlement standing instruction database is to be used to derive the settlement parties involved in the transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<StandingSettlementInstruction, SettlementStandingInstructionDatabaseCode> mmSettlementStandingInstructionDatabase = new MMBusinessAttribute<StandingSettlementInstruction, SettlementStandingInstructionDatabaseCode>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.StandingSettlementInstruction.mmObject();
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::DBNM"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SettlementStandingInstructionDatabase";
			definition = "Specifies what settlement standing instruction database is to be used to derive the settlement parties involved in the transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> SettlementStandingInstructionDatabaseCode.mmObject();
		}

		@Override
		public SettlementStandingInstructionDatabaseCode getValue(StandingSettlementInstruction obj) {
			return obj.getSettlementStandingInstructionDatabase();
		}

		@Override
		public void setValue(StandingSettlementInstruction obj, SettlementStandingInstructionDatabaseCode value) {
			obj.setSettlementStandingInstructionDatabase(value);
		}
	};
	protected Max35Text identification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.StandingSettlementInstruction
	 * StandingSettlementInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the standing instruction."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<StandingSettlementInstruction, Max35Text> mmIdentification = new MMBusinessAttribute<StandingSettlementInstruction, Max35Text>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.StandingSettlementInstruction.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Identification";
			definition = "Identification of the standing instruction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(StandingSettlementInstruction obj) {
			return obj.getIdentification();
		}

		@Override
		public void setValue(StandingSettlementInstruction obj, Max35Text value) {
			obj.setIdentification(value);
		}
	};
	protected CollateralAgreement relatedCollateralAgreement;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CollateralAgreement#mmStandingSettlementInstructions
	 * CollateralAgreement.mmStandingSettlementInstructions}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CollateralAgreement
	 * CollateralAgreement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.StandingSettlementInstruction
	 * StandingSettlementInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedCollateralAgreement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Collateral agreement for which standing settlement instructions are specified."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<StandingSettlementInstruction, CollateralAgreement> mmRelatedCollateralAgreement = new MMBusinessAssociationEnd<StandingSettlementInstruction, CollateralAgreement>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.StandingSettlementInstruction.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedCollateralAgreement";
			definition = "Collateral agreement for which standing settlement instructions are specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> CollateralAgreement.mmStandingSettlementInstructions;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> CollateralAgreement.mmObject();
		}

		@Override
		public CollateralAgreement getValue(StandingSettlementInstruction obj) {
			return obj.getRelatedCollateralAgreement();
		}

		@Override
		public void setValue(StandingSettlementInstruction obj, CollateralAgreement value) {
			obj.setRelatedCollateralAgreement(value);
		}
	};
	protected Max350Text sSIDatabaseName;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.StandingSettlementInstruction
	 * StandingSettlementInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SSIDatabaseName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the settlement standing instruction database to be used to derive the settlement parties involved in a transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<StandingSettlementInstruction, Max350Text> mmSSIDatabaseName = new MMBusinessAttribute<StandingSettlementInstruction, Max350Text>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.StandingSettlementInstruction.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SSIDatabaseName";
			definition = "Specifies the settlement standing instruction database to be used to derive the settlement parties involved in a transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}

		@Override
		public Max350Text getValue(StandingSettlementInstruction obj) {
			return obj.getSSIDatabaseName();
		}

		@Override
		public void setValue(StandingSettlementInstruction obj, Max350Text value) {
			obj.setSSIDatabaseName(value);
		}
	};
	protected SSIDatabaseProvider sSIDatabaseProvider;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SSIDatabaseProvider#mmStandingSettlementDatabase
	 * SSIDatabaseProvider.mmStandingSettlementDatabase}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SSIDatabaseProvider
	 * SSIDatabaseProvider}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.StandingSettlementInstruction
	 * StandingSettlementInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SSIDatabaseProvider"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party which provides information on the parties and accounts to be used to settle a transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<StandingSettlementInstruction, SSIDatabaseProvider> mmSSIDatabaseProvider = new MMBusinessAssociationEnd<StandingSettlementInstruction, SSIDatabaseProvider>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.StandingSettlementInstruction.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SSIDatabaseProvider";
			definition = "Party which provides information on the parties and accounts to be used to settle a transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> SSIDatabaseProvider.mmStandingSettlementDatabase;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SSIDatabaseProvider.mmObject();
		}

		@Override
		public SSIDatabaseProvider getValue(StandingSettlementInstruction obj) {
			return obj.getSSIDatabaseProvider();
		}

		@Override
		public void setValue(StandingSettlementInstruction obj, SSIDatabaseProvider value) {
			obj.setSSIDatabaseProvider(value);
		}
	};
	protected DateTimePeriod validityPeriod;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmRelatedStandingSettlementInstruction
	 * DateTimePeriod.mmRelatedStandingSettlementInstruction}</li>
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
	 * {@linkplain com.tools20022.repository.entity.StandingSettlementInstruction
	 * StandingSettlementInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValidityPeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Period during which the SSI is valid."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<StandingSettlementInstruction, DateTimePeriod> mmValidityPeriod = new MMBusinessAssociationEnd<StandingSettlementInstruction, DateTimePeriod>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.StandingSettlementInstruction.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ValidityPeriod";
			definition = "Period during which the SSI is valid.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> DateTimePeriod.mmRelatedStandingSettlementInstruction;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> DateTimePeriod.mmObject();
		}

		@Override
		public DateTimePeriod getValue(StandingSettlementInstruction obj) {
			return obj.getValidityPeriod();
		}

		@Override
		public void setValue(StandingSettlementInstruction obj, DateTimePeriod value) {
			obj.setValidityPeriod(value);
		}
	};
	protected CurrencyCode currency;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CurrencyCode
	 * CurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.StandingSettlementInstruction
	 * StandingSettlementInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Currency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Currency of the payment to which the SSI applies."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<StandingSettlementInstruction, CurrencyCode> mmCurrency = new MMBusinessAttribute<StandingSettlementInstruction, CurrencyCode>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.StandingSettlementInstruction.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Currency";
			definition = "Currency of the payment to which the SSI applies.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}

		@Override
		public CurrencyCode getValue(StandingSettlementInstruction obj) {
			return obj.getCurrency();
		}

		@Override
		public void setValue(StandingSettlementInstruction obj, CurrencyCode value) {
			obj.setCurrency(value);
		}
	};
	protected Asset asset;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Asset#mmStandingSettlementInstruction
	 * Asset.mmStandingSettlementInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Asset Asset}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.StandingSettlementInstruction
	 * StandingSettlementInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Asset"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Inidicates the asset for the standing settlement instruction."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<StandingSettlementInstruction, Asset> mmAsset = new MMBusinessAssociationEnd<StandingSettlementInstruction, Asset>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.StandingSettlementInstruction.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Asset";
			definition = "Inidicates the asset for the standing settlement instruction.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> Asset.mmStandingSettlementInstruction;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Asset.mmObject();
		}

		@Override
		public Asset getValue(StandingSettlementInstruction obj) {
			return obj.getAsset();
		}

		@Override
		public void setValue(StandingSettlementInstruction obj, Asset value) {
			obj.setAsset(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "StandingSettlementInstruction";
				definition = "Settlement instruction database information.";
				associationDomain_lazy = () -> Arrays.asList(Asset.mmStandingSettlementInstruction, DateTimePeriod.mmRelatedStandingSettlementInstruction, Settlement.mmStandingSettlementInstruction,
						CollateralAgreement.mmStandingSettlementInstructions, SSIDatabaseProvider.mmStandingSettlementDatabase);
				subType_lazy = () -> Arrays.asList(AgentCorporateActionStandingInstruction.mmObject());
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.StandingSettlementInstruction.mmSettlement, com.tools20022.repository.entity.StandingSettlementInstruction.mmFXStandingInstruction,
						com.tools20022.repository.entity.StandingSettlementInstruction.mmSettlementStandingInstructionDatabase, com.tools20022.repository.entity.StandingSettlementInstruction.mmIdentification,
						com.tools20022.repository.entity.StandingSettlementInstruction.mmRelatedCollateralAgreement, com.tools20022.repository.entity.StandingSettlementInstruction.mmSSIDatabaseName,
						com.tools20022.repository.entity.StandingSettlementInstruction.mmSSIDatabaseProvider, com.tools20022.repository.entity.StandingSettlementInstruction.mmValidityPeriod,
						com.tools20022.repository.entity.StandingSettlementInstruction.mmCurrency, com.tools20022.repository.entity.StandingSettlementInstruction.mmAsset);
			}

			@Override
			public Class<?> getInstanceClass() {
				return StandingSettlementInstruction.class;
			}
		});
		return mmObject_lazy.get();
	}

	public List<Settlement> getSettlement() {
		return settlement == null ? settlement = new ArrayList<>() : settlement;
	}

	public StandingSettlementInstruction setSettlement(List<Settlement> settlement) {
		this.settlement = Objects.requireNonNull(settlement);
		return this;
	}

	public YesNoIndicator getFXStandingInstruction() {
		return fXStandingInstruction;
	}

	public StandingSettlementInstruction setFXStandingInstruction(YesNoIndicator fXStandingInstruction) {
		this.fXStandingInstruction = Objects.requireNonNull(fXStandingInstruction);
		return this;
	}

	public SettlementStandingInstructionDatabaseCode getSettlementStandingInstructionDatabase() {
		return settlementStandingInstructionDatabase;
	}

	public StandingSettlementInstruction setSettlementStandingInstructionDatabase(SettlementStandingInstructionDatabaseCode settlementStandingInstructionDatabase) {
		this.settlementStandingInstructionDatabase = Objects.requireNonNull(settlementStandingInstructionDatabase);
		return this;
	}

	public Max35Text getIdentification() {
		return identification;
	}

	public StandingSettlementInstruction setIdentification(Max35Text identification) {
		this.identification = Objects.requireNonNull(identification);
		return this;
	}

	public CollateralAgreement getRelatedCollateralAgreement() {
		return relatedCollateralAgreement;
	}

	public StandingSettlementInstruction setRelatedCollateralAgreement(CollateralAgreement relatedCollateralAgreement) {
		this.relatedCollateralAgreement = Objects.requireNonNull(relatedCollateralAgreement);
		return this;
	}

	public Max350Text getSSIDatabaseName() {
		return sSIDatabaseName;
	}

	public StandingSettlementInstruction setSSIDatabaseName(Max350Text sSIDatabaseName) {
		this.sSIDatabaseName = Objects.requireNonNull(sSIDatabaseName);
		return this;
	}

	public SSIDatabaseProvider getSSIDatabaseProvider() {
		return sSIDatabaseProvider;
	}

	public StandingSettlementInstruction setSSIDatabaseProvider(SSIDatabaseProvider sSIDatabaseProvider) {
		this.sSIDatabaseProvider = Objects.requireNonNull(sSIDatabaseProvider);
		return this;
	}

	public DateTimePeriod getValidityPeriod() {
		return validityPeriod;
	}

	public StandingSettlementInstruction setValidityPeriod(DateTimePeriod validityPeriod) {
		this.validityPeriod = Objects.requireNonNull(validityPeriod);
		return this;
	}

	public CurrencyCode getCurrency() {
		return currency;
	}

	public StandingSettlementInstruction setCurrency(CurrencyCode currency) {
		this.currency = Objects.requireNonNull(currency);
		return this;
	}

	public Asset getAsset() {
		return asset;
	}

	public StandingSettlementInstruction setAsset(Asset asset) {
		this.asset = Objects.requireNonNull(asset);
		return this;
	}
}