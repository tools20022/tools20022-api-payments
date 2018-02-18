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

package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.GeneratedReasonCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the reason why the transaction was generated.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.GeneratedReasonCode#CollateralManagement
 * GeneratedReasonCode.CollateralManagement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.GeneratedReasonCode#ReturnRefusedDumps
 * GeneratedReasonCode.ReturnRefusedDumps}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.GeneratedReasonCode#SplitShaping
 * GeneratedReasonCode.SplitShaping}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.GeneratedReasonCode#ThirdParty
 * GeneratedReasonCode.ThirdParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.GeneratedReasonCode#Transformation
 * GeneratedReasonCode.Transformation}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.GeneratedReasonCode#Other
 * GeneratedReasonCode.Other}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.GeneratedReasonCode#MarketClaim
 * GeneratedReasonCode.MarketClaim}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"COLL"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "GeneratedReasonCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the reason why the transaction was generated."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class GeneratedReasonCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Transaction has been generated for collateral management purposes.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.GeneratedReasonCode
	 * GeneratedReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "COLL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralManagement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction has been generated for collateral management purposes."</li>
	 * </ul>
	 */
	public static final GeneratedReasonCode CollateralManagement = new GeneratedReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralManagement";
			definition = "Transaction has been generated for collateral management purposes.";
			owner_lazy = () -> com.tools20022.repository.codeset.GeneratedReasonCode.mmObject();
			codeName = "COLL";
		}
	};
	/**
	 * Relates to the return of financial instruments resulting from a rejected
	 * delivery without matching operation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.GeneratedReasonCode
	 * GeneratedReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RODE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReturnRefusedDumps"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Relates to the return of financial instruments resulting from a rejected delivery without matching operation."
	 * </li>
	 * </ul>
	 */
	public static final GeneratedReasonCode ReturnRefusedDumps = new GeneratedReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReturnRefusedDumps";
			definition = "Relates to the return of financial instruments resulting from a rejected delivery without matching operation.";
			owner_lazy = () -> com.tools20022.repository.codeset.GeneratedReasonCode.mmObject();
			codeName = "RODE";
		}
	};
	/**
	 * Transaction has been generated to enable settlement following a shortage
	 * of position.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.GeneratedReasonCode
	 * GeneratedReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SPLI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SplitShaping"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction has been generated to enable settlement following a shortage of position."
	 * </li>
	 * </ul>
	 */
	public static final GeneratedReasonCode SplitShaping = new GeneratedReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SplitShaping";
			definition = "Transaction has been generated to enable settlement following a shortage of position.";
			owner_lazy = () -> com.tools20022.repository.codeset.GeneratedReasonCode.mmObject();
			codeName = "SPLI";
		}
	};
	/**
	 * Transaction has been generated by a third party, for example, a central
	 * counterparty.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.GeneratedReasonCode
	 * GeneratedReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "THRD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ThirdParty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction has been generated by a third party, for example, a central counterparty."
	 * </li>
	 * </ul>
	 */
	public static final GeneratedReasonCode ThirdParty = new GeneratedReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ThirdParty";
			definition = "Transaction has been generated by a third party, for example, a central counterparty.";
			owner_lazy = () -> com.tools20022.repository.codeset.GeneratedReasonCode.mmObject();
			codeName = "THRD";
		}
	};
	/**
	 * Transaction has been generated due to transformation following a
	 * corporate action.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.GeneratedReasonCode
	 * GeneratedReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TRAN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Transformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction has been generated due to transformation following a corporate action."
	 * </li>
	 * </ul>
	 */
	public static final GeneratedReasonCode Transformation = new GeneratedReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Transformation";
			definition = "Transaction has been generated due to transformation following a corporate action.";
			owner_lazy = () -> com.tools20022.repository.codeset.GeneratedReasonCode.mmObject();
			codeName = "TRAN";
		}
	};
	/**
	 * Other. See Narrative.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.GeneratedReasonCode
	 * GeneratedReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OTHR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Other"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Other. See Narrative."</li>
	 * </ul>
	 */
	public static final GeneratedReasonCode Other = new GeneratedReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Other";
			definition = "Other. See Narrative.";
			owner_lazy = () -> com.tools20022.repository.codeset.GeneratedReasonCode.mmObject();
			codeName = "OTHR";
		}
	};
	/**
	 * Transaction resulting from a market claim.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.GeneratedReasonCode
	 * GeneratedReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CLAI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarketClaim"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction resulting from a market claim."</li>
	 * </ul>
	 */
	public static final GeneratedReasonCode MarketClaim = new GeneratedReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarketClaim";
			definition = "Transaction resulting from a market claim.";
			owner_lazy = () -> com.tools20022.repository.codeset.GeneratedReasonCode.mmObject();
			codeName = "CLAI";
		}
	};
	final static private LinkedHashMap<String, GeneratedReasonCode> codesByName = new LinkedHashMap<>();

	protected GeneratedReasonCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("COLL");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "GeneratedReasonCode";
				definition = "Specifies the reason why the transaction was generated.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.GeneratedReasonCode.CollateralManagement, com.tools20022.repository.codeset.GeneratedReasonCode.ReturnRefusedDumps,
						com.tools20022.repository.codeset.GeneratedReasonCode.SplitShaping, com.tools20022.repository.codeset.GeneratedReasonCode.ThirdParty, com.tools20022.repository.codeset.GeneratedReasonCode.Transformation,
						com.tools20022.repository.codeset.GeneratedReasonCode.Other, com.tools20022.repository.codeset.GeneratedReasonCode.MarketClaim);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(CollateralManagement.getCodeName().get(), CollateralManagement);
		codesByName.put(ReturnRefusedDumps.getCodeName().get(), ReturnRefusedDumps);
		codesByName.put(SplitShaping.getCodeName().get(), SplitShaping);
		codesByName.put(ThirdParty.getCodeName().get(), ThirdParty);
		codesByName.put(Transformation.getCodeName().get(), Transformation);
		codesByName.put(Other.getCodeName().get(), Other);
		codesByName.put(MarketClaim.getCodeName().get(), MarketClaim);
	}

	public static GeneratedReasonCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static GeneratedReasonCode[] values() {
		GeneratedReasonCode[] values = new GeneratedReasonCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, GeneratedReasonCode> {
		@Override
		public GeneratedReasonCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(GeneratedReasonCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}