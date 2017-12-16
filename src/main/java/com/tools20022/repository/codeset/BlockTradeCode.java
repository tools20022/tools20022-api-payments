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
import com.tools20022.repository.codeset.BlockTradeCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies whether the instruction is the parent or a children of a block
 * trade.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.BlockTradeCode#Parent
 * BlockTradeCode.mmParent}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.BlockTradeCode#Child
 * BlockTradeCode.mmChild}</li>
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
 * <li>"BLPA"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "BlockTradeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies whether the instruction is the parent or a children of a block trade."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class BlockTradeCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Transaction is a block trade parent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BlockTradeCode
	 * BlockTradeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BLPA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Parent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is a block trade parent."</li>
	 * </ul>
	 */
	public static final BlockTradeCode Parent = new BlockTradeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Parent";
			definition = "Transaction is a block trade parent.";
			owner_lazy = () -> com.tools20022.repository.codeset.BlockTradeCode.mmObject();
			codeName = "BLPA";
		}
	};
	/**
	 * Transaction is a block trade child.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BlockTradeCode
	 * BlockTradeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BLCH"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Child"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is a block trade child."</li>
	 * </ul>
	 */
	public static final BlockTradeCode Child = new BlockTradeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Child";
			definition = "Transaction is a block trade child.";
			owner_lazy = () -> com.tools20022.repository.codeset.BlockTradeCode.mmObject();
			codeName = "BLCH";
		}
	};
	final static private LinkedHashMap<String, BlockTradeCode> codesByName = new LinkedHashMap<>();

	protected BlockTradeCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("BLPA");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "BlockTradeCode";
				definition = "Specifies whether the instruction is the parent or a children of a block trade.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.BlockTradeCode.Parent, com.tools20022.repository.codeset.BlockTradeCode.Child);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Parent.getCodeName().get(), Parent);
		codesByName.put(Child.getCodeName().get(), Child);
	}

	public static BlockTradeCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static BlockTradeCode[] values() {
		BlockTradeCode[] values = new BlockTradeCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, BlockTradeCode> {
		@Override
		public BlockTradeCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(BlockTradeCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}