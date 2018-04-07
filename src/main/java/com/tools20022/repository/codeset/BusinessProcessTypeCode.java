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
import com.tools20022.repository.codeset.BusinessProcessTypeCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Type of business process model used to carry out the transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BusinessProcessTypeCode#TripartiteCentralMatching
 * BusinessProcessTypeCode.TripartiteCentralMatching}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BusinessProcessTypeCode#NotCoveredByInvestmentInstructions
 * BusinessProcessTypeCode.NotCoveredByInvestmentInstructions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BusinessProcessTypeCode#PreAccepted
 * BusinessProcessTypeCode.PreAccepted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BusinessProcessTypeCode#Reversal
 * BusinessProcessTypeCode.Reversal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BusinessProcessTypeCode#OwnAccountTradeType
 * BusinessProcessTypeCode.OwnAccountTradeType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BusinessProcessTypeCode#ThroughType
 * BusinessProcessTypeCode.ThroughType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BusinessProcessTypeCode#BillateralCentralMatching
 * BusinessProcessTypeCode.BillateralCentralMatching}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BusinessProcessTypeCode#DuplexType
 * BusinessProcessTypeCode.DuplexType}</li>
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
 * <li>"ISUP"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "BusinessProcessTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Type of business process model used to carry out the transaction."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class BusinessProcessTypeCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Specifies the processing of a transaction in a central matching utility
	 * model.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BusinessProcessTypeCode
	 * BusinessProcessTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ISUP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TripartiteCentralMatching"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the processing of a transaction in a central matching utility model."
	 * </li>
	 * </ul>
	 */
	public static final BusinessProcessTypeCode TripartiteCentralMatching = new BusinessProcessTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TripartiteCentralMatching";
			definition = "Specifies the processing of a transaction in a central matching utility model.";
			owner_lazy = () -> com.tools20022.repository.codeset.BusinessProcessTypeCode.mmObject();
			codeName = "ISUP";
		}
	};
	/**
	 * Specifies the processing of a transaction in a local matching model.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BusinessProcessTypeCode
	 * BusinessProcessTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NISP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotCoveredByInvestmentInstructions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the processing of a transaction in a local matching model."</li>
	 * </ul>
	 */
	public static final BusinessProcessTypeCode NotCoveredByInvestmentInstructions = new BusinessProcessTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotCoveredByInvestmentInstructions";
			definition = "Specifies the processing of a transaction in a local matching model.";
			owner_lazy = () -> com.tools20022.repository.codeset.BusinessProcessTypeCode.mmObject();
			codeName = "NISP";
		}
	};
	/**
	 * Transaction notice results from an agreement made out of a trading
	 * platform between two members (broker and intermediary) of an authorised
	 * entity.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BusinessProcessTypeCode
	 * BusinessProcessTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PRAC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreAccepted"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction notice results from an agreement made out of a trading platform between two members (broker and intermediary) of an authorised entity."
	 * </li>
	 * </ul>
	 */
	public static final BusinessProcessTypeCode PreAccepted = new BusinessProcessTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreAccepted";
			definition = "Transaction notice results from an agreement made out of a trading platform between two members (broker and intermediary) of an authorised entity.";
			owner_lazy = () -> com.tools20022.repository.codeset.BusinessProcessTypeCode.mmObject();
			codeName = "PRAC";
		}
	};
	/**
	 * Transaction notice reverses a previously sent and agreed transaction
	 * notice. If the reversal transaction notice is stated to serve as invoice:<br>
	 * o Fees and taxes contained in the transaction notice are considered as
	 * being in debit of the broker’s account and in credit of the
	 * intermediary’s account: it is a ‘credit invoice’;<br>
	 * o The broker will have to specify the original transaction notice
	 * reference;<br>
	 * o The reversal transaction notice will have the same direction (buy,
	 * sell) as the original transaction notice.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BusinessProcessTypeCode
	 * BusinessProcessTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RSAL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Reversal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction notice reverses a previously sent and agreed transaction notice. If the reversal transaction notice is stated to serve as invoice:\r\no Fees and taxes contained in the transaction notice are considered as being in debit of the broker’s account and in credit of the intermediary’s account: it is a ‘credit invoice’;\r\no The broker will have to specify the original transaction notice reference;\r\no The reversal transaction notice will have the same direction (buy, sell) as the original transaction notice."
	 * </li>
	 * </ul>
	 */
	public static final BusinessProcessTypeCode Reversal = new BusinessProcessTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Reversal";
			definition = "Transaction notice reverses a previously sent and agreed transaction notice. If the reversal transaction notice is stated to serve as invoice:\r\no Fees and taxes contained in the transaction notice are considered as being in debit of the broker’s account and in credit of the intermediary’s account: it is a ‘credit invoice’;\r\no The broker will have to specify the original transaction notice reference;\r\no The reversal transaction notice will have the same direction (buy, sell) as the original transaction notice.";
			owner_lazy = () -> com.tools20022.repository.codeset.BusinessProcessTypeCode.mmObject();
			codeName = "RSAL";
		}
	};
	/**
	 * Specifies the processing of a transaction in a own account trade type
	 * model.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BusinessProcessTypeCode
	 * BusinessProcessTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PROP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OwnAccountTradeType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the processing of a transaction in a own account trade type model."
	 * </li>
	 * </ul>
	 */
	public static final BusinessProcessTypeCode OwnAccountTradeType = new BusinessProcessTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OwnAccountTradeType";
			definition = "Specifies the processing of a transaction in a own account trade type model.";
			owner_lazy = () -> com.tools20022.repository.codeset.BusinessProcessTypeCode.mmObject();
			codeName = "PROP";
		}
	};
	/**
	 * Specifies the processing of a transaction in a through type model.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BusinessProcessTypeCode
	 * BusinessProcessTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "THRU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ThroughType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the processing of a transaction in a through type model."</li>
	 * </ul>
	 */
	public static final BusinessProcessTypeCode ThroughType = new BusinessProcessTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ThroughType";
			definition = "Specifies the processing of a transaction in a through type model.";
			owner_lazy = () -> com.tools20022.repository.codeset.BusinessProcessTypeCode.mmObject();
			codeName = "THRU";
		}
	};
	/**
	 * Specifies the processing of a transaction in a billateral central
	 * matching model.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BusinessProcessTypeCode
	 * BusinessProcessTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "IDEL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BillateralCentralMatching"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the processing of a transaction in a billateral central matching model."
	 * </li>
	 * </ul>
	 */
	public static final BusinessProcessTypeCode BillateralCentralMatching = new BusinessProcessTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BillateralCentralMatching";
			definition = "Specifies the processing of a transaction in a billateral central matching model.";
			owner_lazy = () -> com.tools20022.repository.codeset.BusinessProcessTypeCode.mmObject();
			codeName = "IDEL";
		}
	};
	/**
	 * Specifies the processing of a transaction in a duplex type model.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BusinessProcessTypeCode
	 * BusinessProcessTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DPLX"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DuplexType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the processing of a transaction in a duplex type model."</li>
	 * </ul>
	 */
	public static final BusinessProcessTypeCode DuplexType = new BusinessProcessTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DuplexType";
			definition = "Specifies the processing of a transaction in a duplex type model.";
			owner_lazy = () -> com.tools20022.repository.codeset.BusinessProcessTypeCode.mmObject();
			codeName = "DPLX";
		}
	};
	final static private LinkedHashMap<String, BusinessProcessTypeCode> codesByName = new LinkedHashMap<>();

	protected BusinessProcessTypeCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("ISUP");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "BusinessProcessTypeCode";
				definition = "Type of business process model used to carry out the transaction.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.BusinessProcessTypeCode.TripartiteCentralMatching, com.tools20022.repository.codeset.BusinessProcessTypeCode.NotCoveredByInvestmentInstructions,
						com.tools20022.repository.codeset.BusinessProcessTypeCode.PreAccepted, com.tools20022.repository.codeset.BusinessProcessTypeCode.Reversal,
						com.tools20022.repository.codeset.BusinessProcessTypeCode.OwnAccountTradeType, com.tools20022.repository.codeset.BusinessProcessTypeCode.ThroughType,
						com.tools20022.repository.codeset.BusinessProcessTypeCode.BillateralCentralMatching, com.tools20022.repository.codeset.BusinessProcessTypeCode.DuplexType);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(TripartiteCentralMatching.getCodeName().get(), TripartiteCentralMatching);
		codesByName.put(NotCoveredByInvestmentInstructions.getCodeName().get(), NotCoveredByInvestmentInstructions);
		codesByName.put(PreAccepted.getCodeName().get(), PreAccepted);
		codesByName.put(Reversal.getCodeName().get(), Reversal);
		codesByName.put(OwnAccountTradeType.getCodeName().get(), OwnAccountTradeType);
		codesByName.put(ThroughType.getCodeName().get(), ThroughType);
		codesByName.put(BillateralCentralMatching.getCodeName().get(), BillateralCentralMatching);
		codesByName.put(DuplexType.getCodeName().get(), DuplexType);
	}

	public static BusinessProcessTypeCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static BusinessProcessTypeCode[] values() {
		BusinessProcessTypeCode[] values = new BusinessProcessTypeCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, BusinessProcessTypeCode> {
		@Override
		public BusinessProcessTypeCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(BusinessProcessTypeCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}