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
import com.tools20022.repository.codeset.TransactionActivityCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the type of activity to which this transaction relates.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionActivityCode#BorrowingLendingActivity
 * TransactionActivityCode.mmBorrowingLendingActivity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionActivityCode#MarketClaim
 * TransactionActivityCode.mmMarketClaim}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionActivityCode#CollateralActivity
 * TransactionActivityCode.mmCollateralActivity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionActivityCode#CorporateActionActivity
 * TransactionActivityCode.mmCorporateActionActivity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionActivityCode#SettlementandClearingActivity
 * TransactionActivityCode.mmSettlementandClearingActivity}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"BOLE"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TransactionActivityCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the type of activity to which this transaction relates."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class TransactionActivityCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Transaction relates to lending/borrowing.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionActivityCode
	 * TransactionActivityCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BOLE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BorrowingLendingActivity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction relates to lending/borrowing."</li>
	 * </ul>
	 */
	public static final TransactionActivityCode BorrowingLendingActivity = new TransactionActivityCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BorrowingLendingActivity";
			definition = "Transaction relates to lending/borrowing.";
			owner_lazy = () -> com.tools20022.repository.codeset.TransactionActivityCode.mmObject();
			codeName = "BOLE";
		}
	};
	/**
	 * Transaction relates to a market claim following a corporate action.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionActivityCode
	 * TransactionActivityCode}</li>
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
	 * definition} =
	 * "Transaction relates to a market claim following a corporate action."</li>
	 * </ul>
	 */
	public static final TransactionActivityCode MarketClaim = new TransactionActivityCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarketClaim";
			definition = "Transaction relates to a market claim following a corporate action.";
			owner_lazy = () -> com.tools20022.repository.codeset.TransactionActivityCode.mmObject();
			codeName = "CLAI";
		}
	};
	/**
	 * Transaction relates to collateral.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionActivityCode
	 * TransactionActivityCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "COLL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralActivity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction relates to collateral."</li>
	 * </ul>
	 */
	public static final TransactionActivityCode CollateralActivity = new TransactionActivityCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralActivity";
			definition = "Transaction relates to collateral.";
			owner_lazy = () -> com.tools20022.repository.codeset.TransactionActivityCode.mmObject();
			codeName = "COLL";
		}
	};
	/**
	 * Transaction relates to corporate action.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionActivityCode
	 * TransactionActivityCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CORP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateActionActivity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction relates to corporate action."</li>
	 * </ul>
	 */
	public static final TransactionActivityCode CorporateActionActivity = new TransactionActivityCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateActionActivity";
			definition = "Transaction relates to corporate action.";
			owner_lazy = () -> com.tools20022.repository.codeset.TransactionActivityCode.mmObject();
			codeName = "CORP";
		}
	};
	/**
	 * Transaction relates to settlement and clearing.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionActivityCode
	 * TransactionActivityCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SETT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementandClearingActivity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction relates to settlement and clearing."</li>
	 * </ul>
	 */
	public static final TransactionActivityCode SettlementandClearingActivity = new TransactionActivityCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementandClearingActivity";
			definition = "Transaction relates to settlement and clearing.";
			owner_lazy = () -> com.tools20022.repository.codeset.TransactionActivityCode.mmObject();
			codeName = "SETT";
		}
	};
	final static private LinkedHashMap<String, TransactionActivityCode> codesByName = new LinkedHashMap<>();

	protected TransactionActivityCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("BOLE");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TransactionActivityCode";
				definition = "Specifies the type of activity to which this transaction relates.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.TransactionActivityCode.BorrowingLendingActivity, com.tools20022.repository.codeset.TransactionActivityCode.MarketClaim,
						com.tools20022.repository.codeset.TransactionActivityCode.CollateralActivity, com.tools20022.repository.codeset.TransactionActivityCode.CorporateActionActivity,
						com.tools20022.repository.codeset.TransactionActivityCode.SettlementandClearingActivity);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(BorrowingLendingActivity.getCodeName().get(), BorrowingLendingActivity);
		codesByName.put(MarketClaim.getCodeName().get(), MarketClaim);
		codesByName.put(CollateralActivity.getCodeName().get(), CollateralActivity);
		codesByName.put(CorporateActionActivity.getCodeName().get(), CorporateActionActivity);
		codesByName.put(SettlementandClearingActivity.getCodeName().get(), SettlementandClearingActivity);
	}

	public static TransactionActivityCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static TransactionActivityCode[] values() {
		TransactionActivityCode[] values = new TransactionActivityCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, TransactionActivityCode> {
		@Override
		public TransactionActivityCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(TransactionActivityCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}